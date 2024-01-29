package com.example.cartservice.service;

import com.example.cartservice.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {

    BigDecimal calculateCost(List<Product> products);
}
