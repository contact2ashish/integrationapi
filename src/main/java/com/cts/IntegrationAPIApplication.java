package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class IntegrationAPIApplication {

    private static final Logger logger = (Logger) Logger.getLogger("IntegrationAPIApplication");

    @RequestMapping("/")
    String home() {
        return "Integration API b/w OnPremise and Cloud";
    }

    public static void main(String[] args) {
        logger.info("Inside Main");
        SpringApplication.run(IntegrationAPIApplication.class, args);
    }
}
