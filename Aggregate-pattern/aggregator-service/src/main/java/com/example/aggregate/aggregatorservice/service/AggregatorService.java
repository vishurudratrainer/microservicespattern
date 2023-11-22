package com.example.aggregate.aggregatorservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.aggregate.aggregatorservice.model.AggregateData;
import com.example.aggregate.aggregatorservice.model.AggregateData.Order;
import com.example.aggregate.aggregatorservice.model.AggregateData.Payment;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AggregatorService {

	private final RestTemplate restTemplate;

	private static final String ORDER_SERVICE_URL = "http://localhost:8088/v1/order-service";
	private static final String PAYMENT_SERVICE_URL = "http://localhost:8087/v1/payment-service";

	public AggregateData getAggregateData(Long orderId) {

		var order = restTemplate.getForObject(ORDER_SERVICE_URL + "/order/" + orderId, Order.class);
		var payment = restTemplate.getForObject(PAYMENT_SERVICE_URL + "/order/" + orderId, Payment.class);

		return new AggregateData(order, payment);

	}

}
