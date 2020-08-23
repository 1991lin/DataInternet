package com.data.connector.engine.datasource.rest.controller;

import com.data.connector.engine.datasource.rest.entity.City;
import com.data.connector.engine.datasource.rest.entity.User;
import com.data.connector.engine.datasource.rest.utils.RestServiceTools;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        List<User> userList = getUsers();
        JsonObject root = RestServiceTools.getJsonResponseObject(userList, User.class);
        return root.toString();

    }


    private List<User> getUsers() {
        User a = new User("A", 28, "qingdao");
        User b = new User("B", 37, "wuhang");
        User c = new User("C", 43, "jinan");
        List<User> userList = new ArrayList<User>(3);
        userList.add(a);
        userList.add(b);
        userList.add(c);
        return userList;
    }


    @RequestMapping(value = "/list/cityInfo", method = RequestMethod.GET)
    public String getCityInfo() {
        City a = new City("qingdao", "Shandong");
        City b = new City("wuhang", "HuBei");
        List<City> cityList = new ArrayList<City>(2);
        cityList.add(a);
        cityList.add(b);

        JsonObject root = RestServiceTools.getJsonResponseObject(cityList, City.class);

        return root.toString();
    }
}
