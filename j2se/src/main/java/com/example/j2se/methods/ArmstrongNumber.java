package com.example.j2se.methods;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int av = armstrong(num);
		if(num==av) {
			System.out.println("the number is a armstrong number!");
		}
		else {
			System.out.println("the number is not a armstrong number!");
		}
	}

	private static int armstrong(int num) {	
		int d = dig(num);	//3
		int av=0, rem;
		while(num>0) {			//true
			rem=num%10;			//1
			av+=power(rem, d);	//27+125+1
			num/=10;			//0
		}
		return av;
	}

	private static int power(int b, int p) {
		int res = 1;
		while(p>0) {
			res*=b;
			p--;
		}
		return res;
	}

	private static int digits(int num) {
		int i=0;
		while(num>0) {
			i++;
			num/=10;
		}
		return i;
	}
	
	static int sumn(int n) {
		if(n<1) {
			return 0;
		}
		
		return n+sumn(n-1);
	}
	
	
	static int dig(int num) {
		if(num<=0) {
			return 0;
		}
		return 1+dig(num/10);
	}
	
	/*
	 sumn(5)
	 5+sumn(4);
	 5+4+sumn(3)
	 5+4+3+sumn(2)
	 5+4+3+2+sumn(1)
	 5+4+3+2+1+sumn(0)
	 5+4+3+2+1+0
	
		WAP to evaluate all the fibonacci series values below 100; 
	 */
	
	
	
	
}
