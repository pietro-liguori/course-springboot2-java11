package com.vili.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vili.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
