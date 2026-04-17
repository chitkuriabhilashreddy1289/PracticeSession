package com.Loops;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		int fact = 1;
		for(int i = 2;i<=n;i++) {
			fact=fact*i;

		}
		return fact;


	}
	public static void main (String[]args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a Number");
	  int num = sc.nextInt();
	  int fact =factorial(num);
	  System.out.println(fact);
	  sc.close();

}
}