package com.example.instrumentService.controller;

import com.example.instrumentService.model.Instrument;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InstrumentController {
    @GetMapping(value = "/listinstrument")
    public List<Instrument> listAll(){
        List<Instrument> instruments =  new ArrayList<>();
        instruments.add(new Instrument("UK","TK"));
        instruments.add(new Instrument("USA","PK"));

        return instruments;
    }

    @GetMapping(value="/instrument")
    public Instrument getInstrument(){
        return new Instrument("UK","TK");
    }
}
