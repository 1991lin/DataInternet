package com.data.connector.engine.datasource.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Eric
 * @create: 2020-08-23 00:41
 **/


@Data
@AllArgsConstructor
public class City {
    private String name;
    private String province;
}
