package com.example.j2se.classAndObject.abstraction;

public interface Dao {
	public void connect();
	public void disconnect();
	public void save();
	public void read();
}
