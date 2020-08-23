package com.data.connector.engine.sql.impl;

import com.data.connector.engine.sql.DataInternetBaseVisitor;
import com.data.connector.engine.sql.DataInternetParser;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;

/**
 * @author: Eric
 * @create: 2020-08-23 15:29
 **/


@Data
@Slf4j
public class SqlVisitor extends DataInternetBaseVisitor {
    private Map<String, Set<String>> dataSource = Maps.newHashMap();

    @Override
    public Object visitTableName(DataInternetParser.TableNameContext ctx) {
        String dataSourceType = ctx.getChild(0).getChild(0).getText();
        String dataSourceName = ctx.getChild(0).getChild(2).getText();

        if (dataSource.containsKey(dataSourceType)) {
            dataSource.get(dataSourceType).add(dataSourceName);
        } else {
            dataSource.put(dataSourceType, Sets.newHashSet(dataSourceName));
        }

        log.info("DataSourceType : {}, DataSourceName : {}", dataSourceType, dataSourceName);
        return super.visitTableName(ctx);
    }
}
