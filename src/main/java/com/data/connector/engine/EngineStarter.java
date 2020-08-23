package com.data.connector.engine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Eric
 * @create: 2020-08-21 23:05
 **/

@Slf4j
@SpringBootApplication
public class EngineStarter {
    public static void main(String[] arg) {

        SpringApplication.run(EngineStarter.class, arg);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {

            log.info("Shutdown the Engine for DataConnector");

        }));

    }
}
