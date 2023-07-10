package com.example.j2se.control.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();		//
		int i =0;		//5
		while(num>0) {
			i++;
			num/=10;
		}
		System.out.println("No. of Digits: "+i);
		
	}
}
