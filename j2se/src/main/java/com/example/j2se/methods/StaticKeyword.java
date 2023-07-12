package com.example.j2se.methods;

public class StaticKeyword {
	public static void main(String[] args) {
		Person  p1 = new Person();
		p1.age=56;
		Person  p2 = new Person();
		p2.age=63;
		
		//Person.age=234;
		System.out.println(p2.age);
	}
}

class Person{
	int age;
}
