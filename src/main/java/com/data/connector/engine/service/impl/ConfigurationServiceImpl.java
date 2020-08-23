package com.data.connector.engine.service.impl;

import com.data.connector.engine.dao.impl.ConfigurationDaoImpl;
import com.data.connector.engine.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Eric
 * @create: 2020-08-23 08:55
 **/


@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    private ConfigurationDaoImpl configurationDao;

    @Override
    public String getConfigurationDsl() {
        return configurationDao.getConfigurationDsl();
    }

    @Override
    public String parameterJson() {
        return configurationDao.getConfigurationParametersJson();
    }
}
