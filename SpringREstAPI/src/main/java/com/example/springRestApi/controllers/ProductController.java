package com.example.springRestApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springRestApi.entity.Product;
import com.example.springRestApi.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepo;

	@GetMapping("/products")
	public List<Product> products(){
		System.out.println("Hello");
		List<Product> products =  productRepo.findAll();
		System.out.println("hi");
		return products;
	}
}
