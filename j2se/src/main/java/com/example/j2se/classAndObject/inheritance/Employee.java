package com.example.j2se.classAndObject.inheritance;

public class Employee extends Person{
	int empId;
	String designation;
	float salary;
	@Override
	public String toString() {
		return  super.toString()+"\n Employee [empId=" + empId + ", designation=" + designation + ", salary=" + salary + "]";
	}

	
}
