package com.example.j2se.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {6,4,8,9,1};
		int i,j,k,t;
		for(i=0; i<4; i++) {
			int min=i;
			for(j=min+1; j<a.length; j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			if(min!=i) {
				//swap
				t=a[min];
				a[min]=a[i];
				a[i]=t;
			}
			for(k=0; k<5; k++) {
				System.out.print(a[k]+"   ");
			}
			System.out.println();
		}
		
		
		
	}
}
