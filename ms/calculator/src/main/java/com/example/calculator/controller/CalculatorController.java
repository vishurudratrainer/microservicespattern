package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CalculatorController {

    private final CalculatorService calculatorService;

    @PostMapping("/sum")
    public Double sum(@RequestBody List<Double> value, @RequestParam(required = false) String requestId){
      log.info("Request ID {}",requestId);
        return  calculatorService.sum(value);
    }

    @GetMapping("/welcome")
    public String  welcome(){
        return "Welcome";
    }
}
