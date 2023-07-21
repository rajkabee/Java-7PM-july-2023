package com.example.j2se.classAndObject.abstraction;

public class StudentDao extends AbstractDao{

	@Override
	public void save() {
		System.out.println("Student saved to the database!");
	}

	@Override
	public void read() {
		System.out.println("Student read from the database!");
	}

}
