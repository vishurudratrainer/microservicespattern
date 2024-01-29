package com.example.cartservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@Data
public class CartConfig {
  @Value("${calculator.url}")
    String calculatorUrl;

    @Bean
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
