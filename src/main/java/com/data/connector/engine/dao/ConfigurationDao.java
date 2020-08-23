package com.data.connector.engine.dao;

/**
 * @author: Eric
 * @create: 2020-08-23 08:52
 **/
public interface ConfigurationDao {


    /**
     * get configuration DSL from database
     *
     * @return
     */
    String getConfigurationDsl();


    String getConfigurationParametersJson();

}
