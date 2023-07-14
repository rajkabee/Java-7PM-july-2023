package com.example.j2se.arrays;

public class TwodArray {
	public static void main(String[] args) {
		//int a[][] = new int[3][3];
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int i,j;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
