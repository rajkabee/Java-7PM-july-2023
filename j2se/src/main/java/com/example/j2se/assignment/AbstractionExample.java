package com.example.j2se.assignment;

public class AbstractionExample {
	public static void main(String[] args) {
		Driver ram = new Driver();
		ram.startEngine();
		ram.accelerate();
		ram.brake();
		ram.steerLeft();
		ram.steerRight();
		ram.stopEngine();
		System.out.println(ram);
	}
}

//Generation of interface

interface Vehicle {
	void startEngine();

	void stopEngine();

	void accelerate();

	void brake();

	void steerLeft();

	void steerRight();

	void horn();

}

//Generation of abstract class

abstract class Engine implements Vehicle {
	public void startEngine() {
		System.out.println("Engine Started: ");
	}

	public void stopEngine() {
		System.out.println("Engine Stopped: ");
	}
}

//creating class 

class Driver extends Engine {

	@Override
	public void accelerate() {
		System.out.println("accelerating! speed increasing");
	}

	@Override
	public void brake() {
		System.out.println("Brake! speed dropping");

	}

	@Override
	public void steerLeft() {
		System.out.println("stering left");
	}

	@Override
	public void steerRight() {
		System.out.println("Steering right");
	}

	@Override
	public void horn() {
		System.out.println("Traffic ahead. Horn!!!");
	}

	@Override
	public String toString() {
		return "Driver";
	}

}
