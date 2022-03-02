package com.vili.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vili.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
