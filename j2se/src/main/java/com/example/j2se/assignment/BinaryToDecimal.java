package com.example.j2se.assignment;

import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
	int bin, i=0;
	int rem, dec = 0;
	
	
	System.out.println("Enter Binary Number : ");
	
	
	try (Scanner sc = new Scanner(System.in)) {
		bin = sc.nextInt();
		}
	
//	 binary to Decimal conversion
	while(bin!=0) {
	rem=bin%10;
	bin = bin/10;
	dec = (int) (dec + (rem * Math.pow(2,i)));
	++i;
	}
	System.out.println(dec);
}
}
