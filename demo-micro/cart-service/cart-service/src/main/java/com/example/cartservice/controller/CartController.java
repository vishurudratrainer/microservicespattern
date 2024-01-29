package com.example.cartservice.controller;

import com.example.cartservice.model.Product;
import com.example.cartservice.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/calculate")
    public BigDecimal calculate(@RequestBody List<Product> productList){
        return cartService.calculateCost(productList);
    }
}
