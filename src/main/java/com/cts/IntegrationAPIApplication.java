package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@EnableAutoConfiguration
@SpringBootApplication
public class IntegrationAPIApplication {

    private static final Logger logger = (Logger) Logger.getLogger(String.valueOf(IntegrationAPIApplication.class));

    public static void main(String[] args) {
        logger.info("Inside Main");
        SpringApplication.run(IntegrationAPIApplication.class, args);
    }
}
