package com.data.connector.engine.dao.impl;

import com.data.connector.engine.dao.ConfigurationDao;
import org.springframework.stereotype.Component;

/**
 * @author: Eric
 * @create: 2020-08-23 08:52
 **/


@Component
public class ConfigurationDaoImpl implements ConfigurationDao {
    @Override
    public String getConfigurationDsl() {
        return "select * from database.table.a join database.table.b " +
                "on database.table.a.name = database.table.b.name";
    }
}
