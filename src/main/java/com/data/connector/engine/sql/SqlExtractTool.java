package com.data.connector.engine.sql;

import com.data.connector.engine.sql.impl.SqlVisitor;
import com.google.gson.JsonArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;
import java.util.Set;

/**
 * @author: Eric
 * @create: 2020-08-22 22:12
 **/


@Data
@AllArgsConstructor
@Slf4j
public class SqlExtractTool {

    private String configuredDataCenter;

    public static void main(final String[] arg) {

        String configuredDataCenter = "select dd.name,bb.company from database.bb a join rest.dd d on bb.name = dd.name" +
                " join csv.cc on dd.age = cc.age;";

        SqlExtractTool sqlExtractTool = new SqlExtractTool(configuredDataCenter);
        log.info(sqlExtractTool.getDataSource().toString());


        JsonArray jsonArray = new JsonArray();
        jsonArray.add("dd");
        jsonArray.add("cc");
        System.out.println(jsonArray.toString());

    }

    public Map<String, Set<String>> getDataSource() {
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
