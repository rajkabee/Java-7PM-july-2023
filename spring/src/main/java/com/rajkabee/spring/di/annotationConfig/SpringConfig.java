package com.rajkabee.spring.di.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@PropertySource("application.properties")
@ComponentScan(basePackages = "com.rajkabee.spring.di.annotationConfig")
@Configuration
public class SpringConfig {
	@Bean
	Product getProduct() {
		return new Product();
	}
	
	@Bean//(name="category")
	Category caty() {
		return new Category();
	}
}
