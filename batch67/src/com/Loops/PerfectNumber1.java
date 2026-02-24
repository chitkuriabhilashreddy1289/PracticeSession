package com.Loops;

import java.util.Scanner;

public class PerfectNumber1 {
	static boolean isperfect(int n) {
		//boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean isperfect = isperfect(n);
		if (isperfect) {
			System.out.println("given number is perfect");

		} else {
			System.out.println("given number is not perfect");

		}
		sc.close();	}

}
