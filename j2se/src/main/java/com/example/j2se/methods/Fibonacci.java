package com.example.j2se.methods;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int fValue = fib(n);
		System.out.println(n+"th fibonacci value: "+fValue);
	}

	private static int fib(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
}
