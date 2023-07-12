package com.example.j2se.arrays;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	//100
		int i;
		if(num<2) {
			System.out.println("neither prime nor composite!");
		}
		else {
			for(i=2; i<=num/2; i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==(num/2)+1) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Composite");
			}
		}
		
	}
}
