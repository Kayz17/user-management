package com.dstech.usermanagement.repository;

import com.dstech.usermanagement.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
   
	User findByUsername(String username);
}