package com.example.demoversioning.controller;

import com.example.demoversioning.model.Name;
import com.example.demoversioning.model.StudentV1;
import com.example.demoversioning.model.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UriVersioning {

    @GetMapping("v1/student")
    public StudentV1 studentV1() {
        return new StudentV1("Vishwa Trainer");
    }

    @GetMapping("v2/student")
    public StudentV2 studentV2() {
        return new StudentV2(new Name("Vishwa", "Trainer"));
    }
}
