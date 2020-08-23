package com.data.connector.engine.datasource.rest.controller;

import com.data.connector.engine.datasource.rest.entity.City;
import com.data.connector.engine.datasource.rest.entity.User;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Eric
 * @create: 2020-08-23 00:10
 **/

@Slf4j
@RestController
@RequestMapping(value = "/data")
public class DataController {


    @RequestMapping(value = "/list/userInfo", method = RequestMethod.GET)
    public String getUserInfo() {
        User a = new User("A", 28, "qingdao");
        User b = new User("B", 37, "wuhang");
        User c = new User("C", 43, "jinan");
        List<User> userList = new ArrayList<User>(3);
        userList.add(a);
        userList.add(b);
        userList.add(c);
        JsonObject root = new JsonObject();
        JsonObject dataJson = new JsonObject();
        JsonArray columns = new JsonArray();
        JsonArray columnTypes = new JsonArray();
        JsonArray data = new JsonArray();

        Arrays.stream(User.class.getDeclaredFields()).forEach(x -> {
            x.setAccessible(true);
            columns.add(x.getName());
            columnTypes.add(x.getType().getName());
        });

        userList.stream().forEach(x -> {
            JsonArray jsonArray = new JsonArray();
            Arrays.stream(User.class.getDeclaredFields()).forEach(y -> {
                y.setAccessible(true);
                try {
                    jsonArray.add(String.valueOf(y.get(x)));
                } catch (IllegalAccessException e) {
                    log.error(e.getMessage(), e);
                }
            });
            data.add(jsonArray);
        });

        dataJson.add("columnName", columns);
        dataJson.add("columnType", columnTypes);
        dataJson.add("dataset", data);
        root.add("result", dataJson);
        return root.toString();
    }


    @RequestMapping(value = "/list/citiInfo", method = RequestMethod.GET)
    public Flux<City> getCityInfo(){
        City a = new City("qingdao", "Shandong");
        City b = new City("wuhang", "HuBei");
        List<City> cityList = new ArrayList<City>(2);
        cityList.add(a);
        cityList.add(b);
        return Flux.fromIterable(cityList);
    }
}
