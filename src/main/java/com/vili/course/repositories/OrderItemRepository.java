package com.vili.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vili.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
