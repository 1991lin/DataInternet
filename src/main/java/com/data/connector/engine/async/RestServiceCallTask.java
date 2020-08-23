package com.data.connector.engine.async;

import com.data.connector.engine.datasource.rest.exception.RestCallFailedException;
import com.data.connector.engine.datasource.rest.utils.RestServiceTools;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @author: Eric
 * @create: 2020-08-23 22:08
 **/

@Data
@AllArgsConstructor
@Slf4j
public class RestServiceCallTask implements Callable<String> {

    private String requestUrl;

    @Override
    public String call() throws Exception {
        String response = null;
        try {
            response = RestServiceTools.getRestServiceResponse(requestUrl);
        } catch (RestCallFailedException e) {
            log.error(e.getMessage(), e);
        }
        return response;
    }
}
