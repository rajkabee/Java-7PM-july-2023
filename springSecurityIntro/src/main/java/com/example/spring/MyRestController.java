package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {
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
}
