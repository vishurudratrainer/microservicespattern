package com.example.shop.service;

import com.example.shop.model.Product;

import java.util.List;

public interface OrderService {

     Double getCostOfOrder(List<Product> products);

}
