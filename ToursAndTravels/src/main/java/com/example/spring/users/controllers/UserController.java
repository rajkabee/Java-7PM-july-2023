package com.example.spring.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.users.model.User;
import com.example.spring.users.model.UserRequestDTO;
import com.example.spring.users.services.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("")
	public String addUser(@Valid @RequestBody UserRequestDTO userRequest) {
		System.err.println(userRequest);
		//User user = userService.save(userRequest);
		return "Users created";
	}
	
}
