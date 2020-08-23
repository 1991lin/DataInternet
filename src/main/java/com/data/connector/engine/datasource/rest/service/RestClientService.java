package com.data.connector.engine.datasource.rest.service;

import com.data.connector.engine.datasource.rest.exception.RestCallFailedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author: Eric
 * @create: 2020-08-23 12:01
 **/

@Slf4j
@Service
public class RestClientService {


    @Autowired
    private RestTemplate restTemplate;

    public String getRestResponseFromConfiguredSource(String restEndPoint, HttpMethod httpMethod, Map<String, Object> parameterMap) throws RestCallFailedException {
        ResponseEntity<String> entity = restTemplate.getForEntity(restEndPoint, String.class, parameterMap);

        if (HttpStatus.OK.equals(entity.getStatusCode())) {
            return entity.getBody();
        } else {

            throw new RestCallFailedException("Failed to get the Rest", restEndPoint, httpMethod, parameterMap);

        }
    }

}
