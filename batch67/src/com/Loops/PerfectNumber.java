package com.Loops;

import java.util.Scanner;

public class PerfectNumber {
	static boolean isPerfectnumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			sum += (num % i == 0) ? i : 0;

		}
		return sum == num;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (isPerfectnumber(num)) {
			System.out.println(num + " " + "Given Number is a perfect Number");
		} else {
			System.out.println(num + " " + "Given Number is a not perfect Number");

		}
		sc.close();
 	}
}
