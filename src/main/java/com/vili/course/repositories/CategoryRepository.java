package com.vili.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vili.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
