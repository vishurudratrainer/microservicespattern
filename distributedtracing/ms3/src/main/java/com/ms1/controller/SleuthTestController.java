package com.ms1.controller;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@RestController
public class SleuthTestController {

    Logger logger = LoggerFactory.getLogger("sleuth3");

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/sleuth3")
    public String sleuth3() {
        logger.info("Last Component in the flow");

        return "I am the last component in the application flow";
    }
}