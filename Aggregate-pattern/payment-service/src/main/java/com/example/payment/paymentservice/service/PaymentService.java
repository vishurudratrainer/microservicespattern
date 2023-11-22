package com.example.payment.paymentservice.service;

import org.springframework.stereotype.Service;

import com.example.payment.paymentservice.model.Payment;
import com.example.payment.paymentservice.repo.PaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {

	private final PaymentRepository paymentRepository;

	public Payment getOrder(Long orderId) {

		var paymentEntity = paymentRepository.findByOrderId(orderId).orElseThrow(
				() -> new RuntimeException("Payment details for the orderId " + orderId + " does not exist."));

		return new Payment(orderId, paymentEntity.getStatus());

	}

}
