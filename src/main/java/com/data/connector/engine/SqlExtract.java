package com.data.connector.engine;

import com.data.connector.engine.async.RestServiceCallTask;
import com.data.connector.engine.sql.DataInternetLexer;
import com.data.connector.engine.sql.DataInternetParser;
import com.data.connector.engine.sql.impl.SqlVisitor;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @author: Eric
 * @create: 2020-08-22 22:12
 **/


@Data
@Slf4j
public class SqlExtract {

    static ExecutorService executor = new ThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            20,
            30,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(10));
    private String configuredDataCenter;

    public SqlExtract(String configuredDataCenter) {
        this.configuredDataCenter = configuredDataCenter;
    }

    public static void main(final String[] arg) {

        String configuredDataCenter = "select * from REST.user a join REST.city b on a.city = b.city;";
        SqlExtract sqlExtract = new SqlExtract(configuredDataCenter);
        List<Future<String>> futureList = Lists.newArrayList();
        StopWatch stopWatch = new StopWatch("");
        stopWatch.start();
        execTask(sqlExtract, futureList);
        waitForResponse(futureList);
        stopWatch.stop();
        log.info(stopWatch.prettyPrint());
    }

    private static void execTask(SqlExtract sqlExtract, List<Future<String>> futureList) {
        Map<String, Set<String>> usedDataSource = sqlExtract.getConfiguredDataSource();
        log.info(usedDataSource.toString());
        Map<String, Map<String, String>> mapMap = mockServiceMap();
        usedDataSource.forEach((x, y) -> {
            log.info("ServerType : " + x);
            y.forEach(z -> {
                String url = mapMap.get(x).get(z);
                log.info(url);
                Future<String> future = executor.submit(new RestServiceCallTask(url));
                futureList.add(future);
            });
        });
    }

    private static void waitForResponse(List<Future<String>> futureList) {
        for (Future<String> future : futureList) {
            String response = null;
            try {
                response = future.get();
            } catch (InterruptedException e) {
                log.info(e.getMessage(), e);
            } catch (ExecutionException e) {
                log.info(e.getMessage(), e);
            }

            log.info(response);
        }
    }

    private static Map<String, Map<String, String>> mockServiceMap() {
        Map<String, Map<String, String>> mockService = Maps.newHashMap();

        Map<String, String> restMap = Maps.newHashMap();
        restMap.put("user", "http://localhost:8080/data/list/userInfo");
        restMap.put("city", "http://localhost:8080/data/list/cityInfo");
        mockService.put("REST", restMap);


        Map<String, String> procMap = Maps.newHashMap();
        procMap.put("user", "exec getUserInfo 2");
        mockService.put("DATABASE", procMap);


        return mockService;
    }

    public Map<String, Set<String>> getConfiguredDataSource() {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(configuredDataCenter);
        DataInternetLexer lexer = new DataInternetLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        DataInternetParser dataInternetParser = new DataInternetParser(commonTokenStream);
        SqlVisitor sqlVisitor = new SqlVisitor();
        ParseTree tree = dataInternetParser.statement();
        sqlVisitor.visit(tree);
        return sqlVisitor.getDataSource();
    }

}
