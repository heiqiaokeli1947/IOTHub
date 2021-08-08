package com.pengping.iothub;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://blog.csdn.net/iku5200/article/details/82856621
@MapperScan("com.pengping.iothub.mapper")
@SpringBootApplication
public class IothubApplication {

    private static final Logger logger = LoggerFactory.getLogger(IothubApplication.class);
    public static void main(String[] args) {
        logger.info("IOTHub star.");
        SpringApplication.run(IothubApplication.class, args);
    }

}

