package com.data.connector.engine.datasource.rest.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Eric
 * @create: 2020-08-23 16:39
 **/


@Slf4j
public class RestServiceTools {

    private RestServiceTools() {
    }

    public static String getParameterStringForGetMethod(String parametersJsonString) {
        return "";
    }


    public static String getParamterEntityForPostMethod() {
        return "";
    }


    public static JsonArray getJsonElements(List<?> list, Class targetClass) {
        JsonArray data = new JsonArray();
        list.stream().forEach(x -> {
            JsonArray jsonArray = new JsonArray();
            Arrays.stream(targetClass.getDeclaredFields()).forEach(y -> {
                y.setAccessible(true);
                try {
                    jsonArray.add(String.valueOf(y.get(x)));
                } catch (IllegalAccessException e) {
                    log.error(e.getMessage(), e);
                }
            });
            data.add(jsonArray);
        });
        return data;
    }

    public static JsonObject getJsonObject(JsonArray data, JsonArray columns, JsonArray columnTypes) {
        JsonObject root = new JsonObject();
        JsonObject dataJson = new JsonObject();
        dataJson.add("columnName", columns);
        dataJson.add("columnType", columnTypes);
        dataJson.add("dataSet", data);
        root.add("resultSet", dataJson);
        return root;
    }

    public static void setColumnMeta(JsonArray columns, JsonArray columnTypes, Class targetClass) {
        Arrays.stream(targetClass.getDeclaredFields()).forEach(x -> {
            x.setAccessible(true);
            columns.add(x.getName());
            columnTypes.add(x.getType().getName());
        });
    }

    public static JsonObject getJsonResponseObject(List<?> list, Class targetClass) {
        JsonArray columns = new JsonArray();
        JsonArray columnTypes = new JsonArray();
        setColumnMeta(columns, columnTypes, targetClass);
        JsonArray data = getJsonElements(list, targetClass);
        JsonObject root = getJsonObject(data, columns, columnTypes);
        return root;
    }
}
