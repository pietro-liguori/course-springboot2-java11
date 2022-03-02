package com.vili.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vili.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
