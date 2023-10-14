package com.example.spring.security.jwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.security.jwt.model.User;
import com.example.spring.security.jwt.repos.UserRepository;

@RestController
public class MyController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/admin")
	public String admin() {
		return "This api is secured by JWT Authentication!";
	}
	
	@GetMapping("/addusers")
	public String addUser() {
		userRepo.save(new User(0, "sanjay", passwordEncoder.encode("p@ssw0rd"), "ROLE_ADMIN", true));
		userRepo.save(new User(0, "mandip", passwordEncoder.encode("p@ssw0rd"), "ROLE_USER", true));
		return "Users created";
	}
}
