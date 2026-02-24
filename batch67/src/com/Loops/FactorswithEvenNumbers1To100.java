package com.Loops;

import java.util.Scanner;

public class FactorswithEvenNumbers1To100 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i= 1;i<=n;i++) {
			if(n%i==0) {
				if(i%2==0) {
					System.out.println(i);
					
				}
			}
		}
		
	}

}
