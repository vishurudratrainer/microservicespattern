package com.training.controller;

import com.training.config.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin()

public class HelloWorldController {

	@GetMapping("/showtoken")
	public Object showtoken(@RequestHeader Map<String,String> header) {

		if(header!=null && header.containsKey("authorization")){
			String token = header.get("authorization");
			token =token.replaceAll("Bearer ","");
			return (jwtTokenUtil.getAllClaimsFromToken(token));
		}

		return "Hello World";
	}

	@Autowired
	JwtTokenUtil jwtTokenUtil;
	@RequestMapping({ "/hello" })
	public String hello(@RequestHeader Map<String,String> header) {
		System.out.println("header"+header);
		if(header!=null && header.containsKey("authorization")){
			String token = header.get("authorization");
			token =token.replaceAll("Bearer ","");
			System.out.println(jwtTokenUtil.getAllClaimsFromToken(token));
		}

		return "Hello World";
	}

}
