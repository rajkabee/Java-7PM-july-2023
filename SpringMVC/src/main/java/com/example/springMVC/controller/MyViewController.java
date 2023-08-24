package com.example.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/view")
public class MyViewController {
	
	@RequestMapping("/products")
	public String products(@RequestParam("id") int id, @RequestParam("name") String username) {
		System.out.println("Products  id: "+id+", name: "+username);
		return "products";
	}
	@GetMapping("/products/{id}")
	public String products(@PathVariable("id") int id) {
		System.out.println("get Request PathVariable Id: "+id);
		return "products";
	}
	
	@PostMapping("/categories")
	@ResponseBody
	public String categories(@RequestParam("id") int id) {
		return "post RequestParam Id: "+id;
		//return "products";
	}
	
	

}
