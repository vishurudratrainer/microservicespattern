package com.example.payment.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.paymentservice.model.Payment;
import com.example.payment.paymentservice.service.PaymentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/payment-service")
@RequiredArgsConstructor
public class PaymentController {
	
	private final PaymentService orderService;
	
	@GetMapping("/order/{orderId}")
	public Payment getPaymentStatus(@PathVariable Long orderId) {

		return orderService.getOrder(orderId);

	}


}
