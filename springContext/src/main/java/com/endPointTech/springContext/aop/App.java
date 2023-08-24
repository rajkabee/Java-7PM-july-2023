package com.endPointTech.springContext.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		User user = context.getBean("user", User.class);
		user.task1();
		user.task1("subin");
		user.task1("Sanjay", "Rabina");
		user.task2();
	}
}
