package com.endPointTech.springContext.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@Component("student")
public class Student {
	public int id;
	private String name;
	private String address;
	private boolean active;
	@Autowired
	@Qualifier(value = "lp")
	private Laptop laptop;
	
	

	
}
