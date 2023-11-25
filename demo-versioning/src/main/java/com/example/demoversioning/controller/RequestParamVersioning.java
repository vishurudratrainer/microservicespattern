package com.example.demoversioning.controller;

import com.example.demoversioning.model.Name;
import com.example.demoversioning.model.StudentV1;
import com.example.demoversioning.model.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamVersioning {

    @GetMapping(value = "/student/param", params = "version=1")
    public StudentV1 paramV1() {
        return new StudentV1("Vishwa Trainer");
    }

    @GetMapping(value = "/student/param", params = "version=2")
    public StudentV2 paramV2() {
        return new StudentV2(new Name("Vishwa", "Trainer"));
    }
}
