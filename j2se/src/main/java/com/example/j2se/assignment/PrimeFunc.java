package com.example.j2se.assignment;

import java.util.Scanner;

public class PrimeFunc {
public static void main(String[] args) {
	int num;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter number; ");
		num = sc.nextInt();
	}
	isPrime(num);
}

private static void isPrime(int num) {
	// TODO Auto-generated method stub
	boolean flag = false;
	for(int i=2; i<=num/2; i++) {
		// condition for prime			
		if(num%i==0) {
			flag = true;
		}	
	}
	if (flag) {
		System.out.println(num + " is not prime");
	}else {
		System.out.println(num + " is prime");
	}
	
}
}
