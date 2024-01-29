package com.example.converterservice.controller;

import com.example.converterservice.service.ConversionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class ConversionController {

   private final ConversionService conversionService;

    @GetMapping("/convert/v1")
    public BigDecimal convert(
            @RequestParam String fromCountry,
                              @RequestParam BigDecimal amount){
        return  conversionService.convert(amount,fromCountry);
    }

}
