package com.data.connector.engine.datasource.rest.exception;

import org.springframework.http.HttpMethod;

import java.util.Map;

/**
 * @author: Eric
 * @create: 2020-08-23 13:36
 **/
public class RestCallFailedException extends Throwable {

    private final String url;
    private final HttpMethod httpMethod;
    private final Map<String, Object> parametermaps;

    public RestCallFailedException(String message, String url, HttpMethod httpMethod, Map<String, Object> parametermaps) {
        super(message);
        this.url = url;
        this.httpMethod = httpMethod;
        this.parametermaps = parametermaps;
    }

    @Override
    public String toString() {
        return "RestCallFailedException{" +
                "message : " + this.getMessage() +
                "url='" + url + '\'' +
                ", httpMethod=" + httpMethod +
                ", parametermaps=" + parametermaps +
                '}';
    }
}
