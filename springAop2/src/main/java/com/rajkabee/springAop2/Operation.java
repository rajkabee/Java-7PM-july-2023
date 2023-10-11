package com.rajkabee.springAop2;

import org.springframework.stereotype.Component;

@Component
public class Operation {
	
	
	public void task1() {
		System.out.println("Task1 started...");
	}
	public void task1(int x) {
		System.out.println("Task1 started...");
	}
	public void task2() {
		System.out.println("Task2 started...");
	}
	public void task3() {
		System.out.println("Task3 started...");
	}
}
