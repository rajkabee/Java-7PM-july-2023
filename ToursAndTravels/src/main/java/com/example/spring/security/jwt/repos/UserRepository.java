package com.example.spring.security.jwt.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.security.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public Optional<User> findByUsername(String username);
	
}
