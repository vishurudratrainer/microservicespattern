package com.example.shop.service.impl;

import com.example.shop.model.Product;
import com.example.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final RestTemplate restTemplate;

    @Override
    public Double getCostOfOrder(List<Product> products) {
        Double result = 0.0;
        List<Double> itemsCost =  new ArrayList<>();
        for(Product product: products){
            itemsCost.add(product.getAmount());
        }
        ResponseEntity<Double> resultBody = restTemplate.postForEntity
                ("http://localhost:9001/sum",itemsCost,Double.class);
        if(resultBody.getStatusCode().is2xxSuccessful()){
            result = resultBody.getBody();
        }

        return result;
    }
}
