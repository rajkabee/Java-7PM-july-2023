package com.example.users.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.model.UserRequestDTO;
import com.example.users.services.UserService;

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
