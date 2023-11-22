package com.example.democonfigcliengt;

import com.example.democonfigcliengt.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigCliengtApplication {

	@Autowired
	DemoConfig demoConfig;

	@RequestMapping("/")
	public String hello(){
		return "Hello "+demoConfig.getUserName();
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoConfigCliengtApplication.class, args);
	}

}
