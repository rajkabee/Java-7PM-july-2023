package com.example.j2se.control.loops;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary value: ");
		int bin = sc.nextInt();
		int dec=0, rem, pv=1;
		while(bin>0) {
			rem=bin%10;
			dec=dec+rem*pv;
			pv*=2;
			bin/=10;
		}
		System.out.println("Decimal Value: "+dec);
		
	}
}
