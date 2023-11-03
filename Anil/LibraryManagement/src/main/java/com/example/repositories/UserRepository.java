package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByUsername(String username);

	
}
