package com.example.j2se.arrays;

public class ArraysExample {
	public static void main(String[] args) {
		//int arr[] = new int[5];
		
		
		int arr[] = {6,5,4,7,9,7,9,8,2,1};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum: "+sum);
		int mean = sum/arr.length;
		System.out.println("Mean Value: "+mean);
	}
}
