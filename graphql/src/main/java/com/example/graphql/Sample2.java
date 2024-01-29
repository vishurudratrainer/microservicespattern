package com.example.graphql;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Sample2 {



    public static void main(String[] args) {
        RestTemplate restTemplate =  new RestTemplate();
        ResponseEntity<Todo> data=restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/1",Todo.class);
        System.out.println(data.getBody());
        System.out.println(data.getStatusCode());

    }
}
