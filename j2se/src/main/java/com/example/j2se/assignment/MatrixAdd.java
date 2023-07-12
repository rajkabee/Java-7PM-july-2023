package com.example.j2se.assignment;

public class MatrixAdd {
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int b[][] = {{7,8,6}, {2,5,4}, {1,9,3}};
		int sum[][] = new int[3][3];
//		addition
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}