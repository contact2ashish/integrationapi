package com.cts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class IntegrationAPIController {

    private static final Logger logger = (Logger) Logger.getLogger(String.valueOf(IntegrationAPIController.class));

    @GetMapping("/")
    public String evaluate() {
        return "Integration API b/w OnPremise and Cloud";
    }
}
