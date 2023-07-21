package com.example.j2se.classAndObject.multithreading;

public class MyThread extends Thread {
	int threadId;

	public MyThread(int threadId) {
		super();
		this.threadId = threadId;
	}
	
	@Override
	synchronized public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("thread "+threadId+" running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
