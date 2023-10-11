package com.rajkabee.spring.di.annotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value="cat")
public class Category implements TestInterface{
	@Value("432")
	int id;
	@Value("Shoes")
	String name;
}
