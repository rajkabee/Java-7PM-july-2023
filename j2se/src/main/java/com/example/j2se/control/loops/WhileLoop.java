package com.example.j2se.control.loops;

public class WhileLoop {
	public static void main(String[] args) {
		int i=0;							//init
		while(i<5) {						//while(con)
			System.out.println(i+". Hello");
			i++;							//iter
		}
		
		int n=10;
		int sum=0;
		i=0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum: "+sum);
		n=10;
		int p=1;
		i=1;
		while(i<=n) {
			p*=i;
			i++;
		}
		System.out.println("Product: "+p);
	}
}
