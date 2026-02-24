package com.Loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		System.out.print("Factors of Given Number:");
		 
		for(int i = 1;i<=n/2;i++) {
			if(n%i == 0) {
				System.out.print(i+",");
				
			}
		}
		System.out.print(n);

	}

}
