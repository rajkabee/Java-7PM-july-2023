package com.example.j2se.control.loops;

public class ForLoop {
	public static void main(String[] args) {
		int i;							
		for(i=0; i<5; i++) {						
			System.out.println(i+". Hello");
										
		}
		
		int sum=0;
		for(i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}
}
/*
for(init; con; iter) {
	code block;
}
*/