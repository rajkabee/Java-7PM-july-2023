package com.example.j2se.classAndObject.multithreading;

public class App {
	public static void main(String[] args) {
		int id=234;
		MyThread thread1 = new MyThread(id);
		MyThread thread2 = new MyThread(id);
		MyThread thread3 = new MyThread(id);
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread1.start();
		thread.start();
		thread2.start();
		thread3.start();
	}
}
