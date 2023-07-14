package com.example.j2se.control.loops;

import java.util.Scanner;

public class HCFandLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf=1;
		int x=a, y=b, t;
		while(a%b!=0) {
			a=a%b;
			t=a;
			a=b;
			b=t;
		}
		hcf=b;
		System.out.println("HCF: "+hcf);
		
		int lcm = (x*y)/hcf;
		System.out.println("LCM: "+lcm);
	}
}


/*
 a=5;		12		7
 b=7;		5
 a=a+b;
 b=a-b;
 a=a-b;
 */
