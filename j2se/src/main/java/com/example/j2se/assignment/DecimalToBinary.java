package com.example.j2se.assignment;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		int num;
		int[] bin = new int[50];
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Decimal Number: ");
			num = sc.nextInt();
			}
//		for binary calculation
		int i = 0;
		while(num>0) {
			bin[i] = num%2;
			num=num/2;
			i++;
		}
		
//		for printing binary number in reverse order
		for(int j=i-1;j>=0;j--) {
			System.out.print(bin[j]);
			
		}
		
		
	}
}
