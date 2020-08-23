package com.data.connector.engine.service;

/**
 * @author: Eric
 * @create: 2020-08-23 08:55
 **/
public interface ConfigurationService {

    /**
     * get configuration DSL
     *
     * @return
     */
    String getConfigurationDsl();


    String parameterJson();

}
