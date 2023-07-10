package com.example.j2se.control.loops;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary value: ");
		int bin = sc.nextInt();		//11101
		int dec=0, rem, pv=1;
		while(bin>0) {				//false
			rem=bin%10;				//1
			dec=dec+rem*pv;			//29
			pv*=2;					//32
			bin/=10;				//0
		}
		System.out.println("Decimal Value: "+dec);
		
	}
}
