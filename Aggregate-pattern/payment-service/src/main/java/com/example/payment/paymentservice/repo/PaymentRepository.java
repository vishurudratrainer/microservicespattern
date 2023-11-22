package com.example.payment.paymentservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.payment.paymentservice.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

	public Optional<PaymentEntity> findByOrderId(Long orderId);

}