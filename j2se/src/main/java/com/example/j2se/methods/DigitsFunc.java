package com.example.j2se.methods;

import java.util.Scanner;

public class DigitsFunc {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int d = digits(num);
		System.out.println("No. of digits: "+d);
	}

	static int digits(int num) {			//
		int i =0;
		while(num>0) {
			num/=10;
			i++;
		}
		return i;
	}
}
