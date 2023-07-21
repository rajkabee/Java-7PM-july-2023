package com.example.j2se.classAndObject.abstraction;

public abstract class AbstractDao implements Dao{
	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
}
