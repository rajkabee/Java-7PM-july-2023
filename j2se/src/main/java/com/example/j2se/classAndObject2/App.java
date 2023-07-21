package com.example.j2se.classAndObject2;

import com.example.j2se.classAndObject.Person;

public class App {
	public static void main(String[] args) {
		Person p = new Person(123, "Subin Karki", "Kathmandu");
//		p.id = 123;
//		p.name = "Subin Karki";
//		p.address = "Kathmandu";
		
		Person p2 = new Person();
		p2.id = 345;
		//p2.name = "Nirmala Adhikari";
		//p2.address = "Pokhara";
		
		System.out.println(p2.display());
		System.out.println(p.display());
		
		System.out.println(p);
	}
}

