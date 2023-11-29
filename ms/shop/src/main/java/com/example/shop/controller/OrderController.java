package com.example.shop.controller;

import com.example.shop.model.Product;
import com.example.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    public  Double getCostOfOrder(@RequestBody List<Product> product){
        return  orderService.getCostOfOrder(product);
    }
}
