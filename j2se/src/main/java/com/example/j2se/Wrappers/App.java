package com.example.j2se.Wrappers;

import java.util.ArrayList;


public class App {
	public static void main(String[] args) {
		int x=65;
		Integer y = x;
		int z=y;
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(x);
		nums.add(y);
		nums.add(z);
	}
}
