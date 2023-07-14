package com.example.j2se.arrays;

public class Bubbles {
	public static void main(String[] args) {
		int a[] = {6,9,2,4,8};
		int i,j, k;
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				if(a[j]<a[j+1]) {
					//swap
					a[j]+=a[j+1];
					a[j+1]= a[j]-a[j+1];
					a[j]-=a[j+1];
				}
			}
		}
		for(k=0; k<5; k++) {
			System.out.print(a[k]+"\t");
		}
		
	}
}
/*
a=5;	12;		7;
b=7;	5;
a+=b;
b=a-b;
a-=b;
*/
