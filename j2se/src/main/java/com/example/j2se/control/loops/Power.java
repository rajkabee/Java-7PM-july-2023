package com.example.j2se.control.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b = sc.nextInt();		//2
		System.out.println("Enter the power: ");
		int p = sc.nextInt();		//3
		int res=1,i=0;
		while(i<p) {
			res*=b;
			i++;
		}
		System.out.println("Result: "+res);
		
	}
}
