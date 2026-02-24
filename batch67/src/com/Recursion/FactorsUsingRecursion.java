package com.Recursion;

import java.util.Scanner;

public class FactorsUsingRecursion {
	static void fact(int n, int i) {
		if (i > n) {
			 return  ;

		}
		if (n % i == 0) {
			System.out.println(i);
		}
		fact(n,i+1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(n);
		fact(n,1); 
		
		sc.close();

	}


}
