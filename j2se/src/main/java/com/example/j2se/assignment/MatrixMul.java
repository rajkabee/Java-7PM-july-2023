package com.example.j2se.assignment;

import java.util.Scanner;

public class MatrixMul {
	public static void main(String[] args) {
		int i=0,j=0,k=0,r1,c1,r2,c2;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no. of rows and columns for matrix A: ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.println("Enter no. of rows and columns for matrix B: ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();


		int a[][] = new int [r1][c1];
		int b[][] = new int [r2][c2];
		int mul[][]= new int [r1][c2];
		if (r2!=c1) {
			System.out.println("multiplication is not possible");
		}
		else {

			//		taking input and displaying inputs for matrix A
			System.out.println("Enter the numbers for matrixa A: ");
			for(i=0; i<r1; i++) {
				for (j=0; j<c1; j++) {
					a[i][j]= sc.nextInt();
				}
			}
			for(i=0; i<r1; i++) {
				for (j=0; j<c1; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

			//		Taking input and displaying inputs for matrix B

			System.out.println("Enter the numbers for matrixa b: ");
			for(i=0; i<r2; i++) {
				for (j=0; j<c2; j++) {
					b[i][j]= sc.nextInt();
				}
			}
			for(i=0; i<r2; i++) {
				for (j=0; j<c2; j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
		}


		//	Matrix Multiplication

		for (i=0; i<r1; i++) {
			for(j=0; j<c2; j++) {
				for(k=0; k<r2; k++) {
					mul[i][j]+= a[i][k]*b[k][j];
				}	
			}
		}

		//	for displaying result
		System.out.println("Resultant matrix is: ");
		for (i=0; i<r1; i++) {
			for(j=0; j<c2; j++) {
				for(k=0; k<r2; k++) {
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}

	}
}
