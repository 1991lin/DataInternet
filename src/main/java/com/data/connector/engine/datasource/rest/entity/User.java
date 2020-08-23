package com.data.connector.engine.datasource.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Eric
 * @create: 2020-08-23 00:13
 **/

@Data
@AllArgsConstructor
public class User {
    private String name;
    private int age;
    private String city;


    @Override
    public String toString() {
        return "[" + name + "," + age + "," + city + "]";
    }
}
