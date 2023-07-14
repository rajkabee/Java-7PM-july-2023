package com.example.j2se.arrays;

import java.util.Scanner;

public class MatrixMultiply {
	public static void main(String[] args) {
		int r1,r2,c1,c2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the first matrix: ");
		System.out.println("rows: ");
		r1 = sc.nextInt();
		System.out.println("colouns: ");
		c1 = sc.nextInt();
		System.out.println("Enter the order of the second matrix: ");
		System.out.println("rows: ");
		r2 = sc.nextInt();
		System.out.println("colouns: ");
		c2 = sc.nextInt();
		
		if(c1!=r2) {
			System.out.println("The matrices cannot be miltiplied!");
		}
		else {
			int a[][] = new int[r1][c1];
			int b[][] = new int[r2][c2];
			int p[][] = new int[r1][c2];
			int i,j,k;
			System.out.println("Enter the elements of first matrix: ");
			for(i=0; i<r1; i++) {
				for(j=0; j<c1; j++) {
					System.out.println("a["+i+"]["+j+"] : ");
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the elements of second matrix: ");
			for(i=0; i<r2; i++) {
				for(j=0; j<c2; j++) {
					System.out.println("b["+i+"]["+j+"] : ");
					b[i][j] = sc.nextInt();
				}
			}
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					p[i][j] = 0;
					for(k=0; k<r2; k++) {
						p[i][j]+=a[i][k]*b[k][j];
					}
					System.out.print(p[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		
//		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
//		int[][] p = new int[3][3];
//		int i,j,k;
//		System.out.println("the Resultant Matrix: ");
//		for(i=0; i<3; i++) {
//			for(j=0; j<3; j++) {
//				p[i][j] = 0;
//				for(k=0; k<3; k++) {
//					p[i][j]+=a[i][k]*b[k][j];
//				}
//				System.out.print(p[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
	}
}


