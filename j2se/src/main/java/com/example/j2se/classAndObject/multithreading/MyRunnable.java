package com.example.j2se.classAndObject.multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("MyRunnable running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
