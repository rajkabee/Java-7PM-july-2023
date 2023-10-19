package com.example.spring.users.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.users.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public Optional<User> findByUsername(String username);
	
}
