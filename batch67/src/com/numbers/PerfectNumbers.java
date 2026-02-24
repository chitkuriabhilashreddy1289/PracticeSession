package com.numbers;

import java.util.Scanner;

public class PerfectNumbers {
	static int sum = 0;

	static boolean isPerfect(int num) {
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to validate perfectnumber");
		int num = sc.nextInt();
		if (isPerfect(num)) {
			System.out.println("the given number is perfect");
		} else {
			System.out.println("the given number is not perfect");
		}
       sc.close();
	}
}