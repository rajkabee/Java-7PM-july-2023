package com.example.j2se.control.loops;

import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int dec = sc.nextInt();		//29
		int bin=0, pv=1, rem; 		
		while(dec>0) {				//false
			rem = dec%2;			//1
			bin = rem*pv+bin;		//11101
			pv*=10;					//100000
			dec/=2;					//0
		}
		System.out.println("Binary Value: "+bin);
	}
}
