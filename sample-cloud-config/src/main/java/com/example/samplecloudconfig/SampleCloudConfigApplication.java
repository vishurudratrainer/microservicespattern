package com.example.samplecloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SampleCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleCloudConfigApplication.class, args);
	}

}
