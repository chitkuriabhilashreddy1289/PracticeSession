package com.Loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int originalnumber=n;
		int reversenum = 0;
		while (n != 0) {
			int num = n % 10;
			reversenum = reversenum * 10 + num;
			n = n / 10;
		}
		if(originalnumber==reversenum) {
			System.out.println(originalnumber+"  "+" number is palindrom");
		}
		else {

			System.out.println(originalnumber+"  "+"number is not a palindrom");
		}
		sc.close();
	}

}
