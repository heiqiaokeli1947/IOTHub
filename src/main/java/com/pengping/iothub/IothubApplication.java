package com.pengping.iothub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IothubApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(IothubApplication.class);
    public static void main(String[] args) {
        LOGGER.info("IOTHub star.");
        SpringApplication.run(IothubApplication.class, args);
    }

}
