package com.example.j2se.assignment;

import java.util.Scanner;

public class HcfAndLcm {
public static void main(String[] args) {
	int num1, num2, temp;
	System.out.println("Enter two numbers (num1 > num2)");
	try (Scanner sc = new Scanner(System.in)) {
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		}
	
//	For HCF 
	int temp1 = num1;
	int temp2 = num2;
	
	while (temp2!=0) {
		 temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
	}
	int hcf = temp1; 
	System.out.println("HCF = "+ hcf);
	
//	For LCM
	
	int lcm = (num1*num2)/hcf;
	System.out.println("LCM = "+ lcm);
}
}




