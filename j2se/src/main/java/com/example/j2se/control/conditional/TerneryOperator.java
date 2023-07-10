package com.example.j2se.control.conditional;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		//String msg = age<18?"minor":"adult";
		String msg = age<18?"minor":age<60?"adult":"Senior";
		System.out.println(msg);
	}
}
