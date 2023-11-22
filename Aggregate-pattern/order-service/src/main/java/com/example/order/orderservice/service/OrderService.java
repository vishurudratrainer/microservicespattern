package com.example.order.orderservice.service;

import org.springframework.stereotype.Service;

import com.example.order.orderservice.model.Order;
import com.example.order.orderservice.repo.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;

	public Order getOrder(Long id) {

		var orderDetails = orderRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Order with id " + id + " does not exist."));

		return new Order(id, orderDetails.getName(), orderDetails.getPrice());

	}

}
