package com.example.j2se.classAndObject;

public class Person {
	public int id;
	protected String name;
	private String address;
	static int zip;
	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person() {
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public String display() {
		return id+". "+name+"\t"+address;
	}
}
