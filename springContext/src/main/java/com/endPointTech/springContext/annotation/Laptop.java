package com.endPointTech.springContext.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component("lp")
public class Laptop {
	//@Value("${laptop.id}")
	private int id;
	//@Value("${laptop.brand}")
	private String brand;
	//@Value("${laptop.model}")
	private String model;
}
