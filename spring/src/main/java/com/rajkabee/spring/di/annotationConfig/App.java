package com.rajkabee.spring.di.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("annotations.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Product product = (Product)ctx.getBean("product");
		System.out.println(product);
		Product pd = (Product)ctx.getBean("getProduct");
		System.out.println(pd);
//		Category cat = ctx.getBean("category", Category.class);
//		System.out.println(cat);
	}
}
