package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.User;
import com.example.spring.repo.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("")
	public String home() {
		return "<h1>Home Page</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Admin's Page</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>User's Page</h1>";
	}
	@GetMapping("/addusers")
	public String addUser() {
		userRepo.save(new User(0, "sanjay", passwordEncoder.encode("p@ssw0rd"), "ROLE_ADMIN", true));
		userRepo.save(new User(0, "mandip", passwordEncoder.encode("p@ssw0rd"), "ROLE_USER", true));
		return "Users created";
	}
}
