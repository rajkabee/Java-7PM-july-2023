package com.example.j2se.control.conditional;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("Choice: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Mochaccino is served!");
			break;
		case 'c':
			System.out.println("Cappuccino is served!");
			break;
		default:
			System.out.println("Invalid Choice!");
		}
		
		String treat = switch(ch) {
		case 'a','b'->{
			yield "Choco Chips Cookie";
		}
		default->{
			yield "Jeera Cookie";
		}
		};
		System.out.println("with "+treat);
	
	}
}
