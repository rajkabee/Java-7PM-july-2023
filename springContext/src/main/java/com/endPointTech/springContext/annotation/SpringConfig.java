package com.endPointTech.springContext.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.endPointTech.springContext.annotation")
@PropertySource("application.properties")
public class SpringConfig {
	
	@Bean
	public Laptop getLaptop() {
		return new Laptop(124221, "Acer", "Ultrabook7");
	}
}
