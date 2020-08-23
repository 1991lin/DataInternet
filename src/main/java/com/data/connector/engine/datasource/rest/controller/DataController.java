package com.data.connector.engine.datasource.rest.controller;

import com.data.connector.engine.datasource.rest.entity.City;
import com.data.connector.engine.datasource.rest.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

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
    public Flux<User> getUserInfo(){
        User a = new User("A",28,"qingdao");
        User b = new User("B", 37, "wuhang");
        User c = new User("C", 43, "jinan");
        List<User> userList = new ArrayList<User>(3);
        userList.add(a);
        userList.add(b);
        userList.add(c);
        return Flux.fromIterable(userList);
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
