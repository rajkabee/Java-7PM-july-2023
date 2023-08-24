package com.example.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springMVC.Order;


@Controller
public class ViewController {
	
	@GetMapping("")
	public String index(
			@RequestParam("name") String name,
			@RequestParam("address") String address,
			Model model
			) {
		model.addAttribute("username", "Prasanna");
		model.addAttribute("order", new Order(1234, "dasdas123123", "bricks"));
		System.out.println(name+": "+address);
		return "index.html";
	}
	@ResponseBody
	@PostMapping("")
	public String newOrder(@RequestBody Order order ) {
		System.out.println(order);
		return "Good Job!";
	}
	
	@GetMapping("/products/{id}")
	@ResponseBody
	public String products(@PathVariable("id") int id) {
		System.out.println("id: "+id);
		return "hello";
	}
	
}
