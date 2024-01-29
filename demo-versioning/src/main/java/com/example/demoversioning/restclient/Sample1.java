package com.example.demoversioning.restclient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Sample1 {

    public static void main(String[] args) {
        RestTemplate restTemplate =  new RestTemplate();
        ResponseEntity<String> data=restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos",String.class);
        System.out.println(data.getBody());
        System.out.println(data.getStatusCode());

    }
}
