package com.rajkabee.spring.di.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("product")
public class Product {
	@Value("${product.id}")
	int id;
	@Value("${product.name}")
	String name;
	@Value("13000")
	float price;
	@Autowired
	@Qualifier("caty")
	TestInterface cats;
}
