package com.example.j2se.methods;

import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {
		int a=5, b=7, sum;
		sum=add(a,b);
		System.out.println("Sum: "+sum);
		subtract(a,b);
		multiply();
		System.out.println("Pi: "+pi());
	}
	
	static int add(int x, int y){
		int c = x+y;
		return c;
	}
	static void subtract(int m, int n) {
		int diff = m-n;
		System.out.println("Difference: "+diff);
	}
	
	static void multiply(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int p = x*y;
		System.out.println("Product: "+p);
	}
	
	static float pi() {
		return 3.1415f;
	}
}
