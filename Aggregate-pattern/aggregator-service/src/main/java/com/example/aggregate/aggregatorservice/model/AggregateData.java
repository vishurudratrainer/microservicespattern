package com.example.aggregate.aggregatorservice.model;

public record AggregateData(Order order, Payment payment) {

	public record Order(Long orderId, String name, double price) {

	}

	public record Payment(Long orderId, String status) {

	}

}
