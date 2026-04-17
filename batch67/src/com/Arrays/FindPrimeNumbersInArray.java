package com.Arrays;

public class FindPrimeNumbersInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 3, 9,11 };
		for (int n : arr) {
			if(n<=1) {
				continue;
			}
			boolean isprime = true;

			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					isprime = false;
                    break;
				}

			}
			if(isprime) {
        		System.out.println("prime numbers:"+n);
        	   }
		}

	}
}