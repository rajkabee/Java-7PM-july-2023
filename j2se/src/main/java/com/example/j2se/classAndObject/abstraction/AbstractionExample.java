package com.example.j2se.classAndObject.abstraction;

public class AbstractionExample {
	public static void main(String[] args) {
		StudentDao sDao = new StudentDao();
		sDao.connect();
		sDao.save();
		sDao.read();
		sDao.disconnect();
	}
}
