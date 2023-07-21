package com.example.j2se.classAndObject.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		int res1 = obj.add(2,3);
		System.out.println("Sum1: "+res1);
		int res2 = obj.add(2,3,5);
		System.out.println("Sum2: "+res2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
	int add(int x, int y, int z) {
		int sum = x+y+z;
		return sum;
	}
}
