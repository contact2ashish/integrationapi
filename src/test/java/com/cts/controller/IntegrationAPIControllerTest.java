package com.cts.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationAPIControllerTest {

    @Test
    public void testHomeController() {
        IntegrationAPIController apiController = new IntegrationAPIController();
        String result = apiController.evaluate();
        assertEquals(result, "Integration API b/w OnPremise and Cloud");
    }
}
