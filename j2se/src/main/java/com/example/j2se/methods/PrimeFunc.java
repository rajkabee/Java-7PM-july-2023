package com.example.j2se.methods;

import java.util.Scanner;

public class PrimeFunc {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<2) {
			System.out.println("Neither prime nor composite!");
		}
		else {
			boolean isPrime = prime(num);
			if(isPrime) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Composite");
			}
		}
	}

	static boolean prime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
