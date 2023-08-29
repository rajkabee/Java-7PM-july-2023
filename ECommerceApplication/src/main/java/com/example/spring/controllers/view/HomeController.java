package com.example.spring.controllers.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring.model.entity.Product;
import com.example.spring.model.repositories.ProductRepository;


@Controller
public class HomeController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("")
	public String home(Model model) {
		List<Product> products = productRepository.findAll();
		model.addAttribute("items",products);
		return "index";
	}
	
	
	
}
