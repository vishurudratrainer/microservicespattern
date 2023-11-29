package com.example.springeurekaclientstudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaClientStudentServiceApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientStudentServiceApplication1.class, args);
	}
}
