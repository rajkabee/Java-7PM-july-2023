package com.example.j2se.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> students = new TreeMap<>();
		students.put("Ram", 69);
		students.put("Shyam", 57);
		students.put("Hari", 34);
		students.put("Gita", 22);
		students.put("null", null);
		
//		students.forEach((key, value)->{
//			System.out.println(key+". "+value);
//		});
//		
//		System.out.println(students.get("Shyam"));
//		
		for(Entry<String, Integer> entry:students.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
	}
}
