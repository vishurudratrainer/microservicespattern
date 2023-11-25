package com.example.demoversioning.controller;

import com.example.demoversioning.model.Name;
import com.example.demoversioning.model.StudentV1;
import com.example.demoversioning.model.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaTypeVersioning {

    @GetMapping(value = "/student/produces", produces = "application/vnd.company.app-v1+json")
    public StudentV1 producesV1() {
        return new StudentV1("Vishwa Trainer");
    }
//Accept=application/vnd.company.app-v1+json
    @GetMapping(value = "/student/produces", produces = "application/vnd.company.app-v2+json")
    public StudentV2 producesV2() {
        return new StudentV2(new Name("Vishwa", "Trainer"));
    }
}
