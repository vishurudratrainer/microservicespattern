package com.example.demowebrestswagger.controller;

import com.example.demowebrestswagger.model.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NameController {

    List<Name> nameList =  new ArrayList<>();
    @PostMapping("/name")
    public boolean addName(@RequestBody Name name){
        nameList.add(name);
        return true;
    }

    @GetMapping("/name")
    public List<Name> getNameList(){
        return  nameList;
    }
}
