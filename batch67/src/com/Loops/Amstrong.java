package com.Loops;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int originalnumber = number;
		int sum = 0;

		while (number != 0) {
			int n = number % 10;
			sum = sum + n * n * n;
			number = number / 10;
		}
		if (sum == originalnumber) {
			System.out.println(originalnumber + "number is Amstrong");

		} else {
			System.out.println(originalnumber + "number is not Amstrong");

		}
		sc.close();
	}

}
