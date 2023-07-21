package com.example.j2se.classAndObject;

public class App {
	public static void main(String[] args) {
		Person p = new Person(123, "Subin Karki", "Kathmandu");
//		p.id = 123;
//		p.name = "Subin Karki";
//		p.address = "Kathmandu";
		p.zip=321;
		Person p2 = new Person();
		p2.id = 345;
		p2.name = "Nirmala Adhikari";
		//p2.address = "Pokhara";
		p2.zip=234234;
		System.out.println(p2.display());
		System.out.println(p.display());
		Person.zip=21313;
		System.out.println(p);
	}
}
