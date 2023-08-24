package com.endPointTech.springContext.aop;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User {
	int id;
	String name;
	String password;
	
	public void task1() {
		System.out.println("task 1 commenced...");
	}
	public void task1(String arg) {
		System.out.println("task 1 with argument commenced...");
	}
	public void task1(String arg1, String arg2) {
		System.out.println("task 1 with arguments commenced...");
	}
	public void task2() {
		System.out.println("task 2 commenced...");
	}
}
