package com.comstructors1;

import java.util.Scanner;

public class Calculator {
	int a;
	int b;

	int add(int a, int b) {
		return a + b;

	}

	int sub(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	double div(int a, int b) {
		return (double) a / b;
	}

	/*
	 * int mod(INT a, int b) { if (b == 0) {
	 * ArithmeticException("Division by zero is not allowed");
	 * 
	 * return a % b;
	 */
		
	

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value a");
		int num1 = sc.nextInt();
		System.out.println("enter value b");
		int num2 = sc.nextInt();
		System.out.println("enter value b");
		sc.close();

		System.out.println("Addition " + c.add(num1, num2));
		System.out.println("Subtractoin " + c.sub(num1, num2));
		System.out.println("product" + c.mul(num1, num2));
		System.out.println("Division " + c.div(num1, num2));
		//System.out.println("Modulus " + c.mod(num1, num2));
		try {
			System.out.println("Done");
		}

		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}