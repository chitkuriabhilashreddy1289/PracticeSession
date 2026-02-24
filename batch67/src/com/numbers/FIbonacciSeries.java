package com.numbers;

import java.util.Scanner;

public class FIbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a limit");
		int limit = sc.nextInt();
		int n = 0;
		int n1 = 1;
		for (int i = 1; i <= limit; i++) {
			System.out.print(n + " ");
			int n2 = n + n1;
			n = n1;
			n1 = n2;
		}
		sc.close();
	}

}
