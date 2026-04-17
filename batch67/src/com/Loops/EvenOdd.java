package com.Loops;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Even Numbers:");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number:"+i + ",");

			}



			else {
				System.out.println("Odd number:"+i+ ",");

			}
		}
	}

}
