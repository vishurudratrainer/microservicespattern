package com.example.aggregate.aggregatorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aggregate.aggregatorservice.model.AggregateData;
import com.example.aggregate.aggregatorservice.service.AggregatorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/Aggregate-service")
@RequiredArgsConstructor
public class AggregatorController {
	
	private final AggregatorService orderService;
	
	@GetMapping("/order/{orderId}")
	public AggregateData getAggregateData(@PathVariable Long orderId) {

		return orderService.getAggregateData(orderId);

	}


}
