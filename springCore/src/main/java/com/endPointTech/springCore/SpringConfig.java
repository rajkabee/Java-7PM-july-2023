package com.endPointTech.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
@ComponentScan(basePackages = "com.endPointTech.springCore")
public class SpringConfig {
	@Bean("post")
	public Post getPost() {
		return new Post(1,2,"Sasdsad","dasdasda",null);
	}
	
	@Bean(name="comment2")
	public Comment getComment() {
		return new Comment(12, 2345, "Well Done");
	}
	
}
