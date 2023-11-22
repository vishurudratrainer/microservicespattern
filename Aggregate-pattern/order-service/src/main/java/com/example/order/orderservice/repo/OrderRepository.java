package com.example.order.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.orderservice.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
	
	
}