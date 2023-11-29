package com.example.shop.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product {

    private final Long id;
    private final Double amount;
    private final String productName;
}
