package com.example.j2se.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(123);
		list.add(456);
		list.add(789);
		
//		list.forEach(System.out::println);
//		list.forEach(x->{
//			System.out.println(x);
//		});
//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i));
//		}
//		for(int x:list) {
//			System.out.println(x);
//		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
