package com.example.converterservice.service;

import java.math.BigDecimal;

public interface ConversionService {

    BigDecimal convert(BigDecimal amount, String country);}
