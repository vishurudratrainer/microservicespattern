package com.example.samplehealth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SampleMain {
    public static void main(String[] args) {
        RestTemplate restTemplate =  new RestTemplate();
        ResponseEntity<String> response=restTemplate.getForEntity("http://localhost:8090/actuator/health",String.class);
        System.out.println(response.getBody());
    }
}
