package com.example.j2se.assignment;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int num,i;
		boolean flag = false;
		System.out.println("Enter number:");
		try (Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();}
		for(i=2; i<=num/2; i++) {
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
