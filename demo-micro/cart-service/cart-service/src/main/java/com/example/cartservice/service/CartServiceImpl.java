package com.example.cartservice.service;

import com.example.cartservice.config.CartConfig;
import com.example.cartservice.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
   private final RestTemplate restTemplate;
   private final CartConfig config;

    @Override
    public BigDecimal calculateCost(List<Product> products) {
        BigDecimal amount = BigDecimal.ZERO;
        for(Product p: products){
           amount= amount.add(p.getCost());
        }

        BigDecimal result = restTemplate.getForObject(config.getCalculatorUrl()+"?fromCountry=IN&amount="+amount.toPlainString()
                ,BigDecimal.class);

        return result;
    }
}
