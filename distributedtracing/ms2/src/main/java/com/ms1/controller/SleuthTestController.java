package com.ms1.controller;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@RestController
public class SleuthTestController {

    Logger logger = LoggerFactory.getLogger("sleuth2");
    @Autowired
    private RestTemplate restTemplate;
    //= new RestTemplate();

    @GetMapping("/sleuth2")
    public String sleuth1() {


        logger.info("This is the second component in the flow");

        return restTemplate.getForObject("http://localhost:8082/sleuth3", String.class);
    }
}