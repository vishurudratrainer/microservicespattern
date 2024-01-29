package com.example.cartservice.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    String name;
    BigDecimal cost;

}
