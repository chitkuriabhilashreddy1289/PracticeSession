package com.Loops;

import java.util.Scanner;

public class ReverseNumber1 {
            static int  reversenumber(int num) {

		int rev = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}




		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
	       int rev=  (reversenumber(num));
		if (rev==num) {
			System.out.println("palindrom");
		}

		else {
			System.out.println("not a palindrom");

		}
	}

}
