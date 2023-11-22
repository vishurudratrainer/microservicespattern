package com.ms1.controller;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@RestController
public class SleuthTestController {

    Logger logger = LoggerFactory.getLogger("sleuth1");
  @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sleuth1")
    public String sleuth1() {


        logger.info("Flow started here");

        return restTemplate.getForObject("http://localhost:8081/sleuth2", String.class);
    }
}