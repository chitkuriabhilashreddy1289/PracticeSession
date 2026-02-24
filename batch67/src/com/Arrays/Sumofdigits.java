package com.Arrays;

public class Sumofdigits {

	public static void main(String[] args) {
		int n = 987;
		int rem = 0;
		while(n>10) {
			int sum = 0;

		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		n=sum;
		}
		System.out.println(n);
	}

}
