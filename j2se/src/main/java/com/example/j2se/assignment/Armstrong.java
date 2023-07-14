package com.example.j2se.assignment;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int num,rem,av=0, i=0,count,avcheck;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		avcheck =num;
		count = num;
		while (count>0) {
			i++;
			count/=10;
		}


		while(num>0) {
			int result =1;
			rem = num%10;
			for (count = 1; count <= i; count++) {
				result *= rem;
			}
			av = av + result; 
			num/=10;
		}
		System.out.println(av);
		
		if(avcheck==av) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not armstrong Number");
		}
	}
}
