package com.example.calculator.service.impl;

import com.example.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Double sum(List<Double> values) {
        Double result = 0.0;
        for(Double v: values){
            result = result+ v;
        }
        return result;
    }
}
