package com.data.connector.engine.datasource.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Eric
 * @create: 2020-08-23 13:25
 **/

@Configuration
public class RestConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
