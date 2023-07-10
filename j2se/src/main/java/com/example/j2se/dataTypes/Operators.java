package com.example.j2se.dataTypes;

public class Operators {
	public static void main(String[] args) {
		int x=23;
		x=34+45;
		x=34-12;
		x=10/3;
		System.out.println("x: "+x);
		x=10%3;
		System.out.println("x: "+x);
		//x=x+34;
		x+=34;
		System.out.println("x: "+x);
		x=x+1;
		x+=1;
		x++;
		++x;
		System.out.println("x: "+x);
		int y=x++;
		System.out.println("x: "+x+", y="+y);
		y=++x;
		System.out.println("x: "+x+", y="+y);
		
		
	}
}


/*
	op
	arithmetic
	=	assignment op
	+
	-
	/
	*
	%	modulus /remainder
	
	
	combination
	+=
	-=
	/=
	*=
	%=
	
	
	unary operator
	++
	--
	
	conditional		true/false
	x==y
	>
	<
	!=
	<=
	>=
	!>
	!<
	
	logical operator
	AND	&&
	OR	||
	NOT	!
	
	A	B	A&&B	A||B
	0	0	0		0
	0	1	0		1
	1	0	0		1
	1	1	1		1
	
	A	!A
	0	1
	1	0
	
	
	
	*/


