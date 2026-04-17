package com.Multithreading;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread running");
	}



}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread using Runnable");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
	}

}
