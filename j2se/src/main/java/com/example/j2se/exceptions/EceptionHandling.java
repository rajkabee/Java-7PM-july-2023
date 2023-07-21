package com.example.j2se.exceptions;

public class EceptionHandling {
	public static void main(String[] args) 
{
		try {
			connect();
		} catch (ClassNotFoundException e) {
			System.err.print(false);
		}
		
	}

	private static void connect() throws ClassNotFoundException {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	}
	
}
