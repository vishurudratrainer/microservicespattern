package com.example.priceservice.controller;

import com.example.priceservice.model.Price;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PriceController {

    @GetMapping(value = "/listprices")
    public List<Price> listAll(){
        List<Price> prices =  new ArrayList();
        prices.add(new Price("UK",90.0));
        prices.add(new Price("US",75.0));
        return prices;
    }
}
