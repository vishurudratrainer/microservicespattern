package com.example.converterservice.service.impl;

import com.example.converterservice.service.ConversionService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConversionServiceImpl  implements ConversionService {
     static Map<String,BigDecimal> conversionFactor = new HashMap<>();
    {
        conversionFactor.put("IN",BigDecimal.valueOf(80L));
        conversionFactor.put("UK",BigDecimal.valueOf(8L));

    }

    @Override
    public BigDecimal convert(BigDecimal amount, String country) {
        BigDecimal result = BigDecimal.ZERO;
        if(conversionFactor.containsKey(country)){
            result=amount.multiply(conversionFactor.get(country));
        }
        return result;
    }
}
