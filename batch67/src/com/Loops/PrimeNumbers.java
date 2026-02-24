package com.Loops;

import java.util.Scanner;


public class PrimeNumbers {
	

	static boolean isArmstrong(int n) {
		boolean flag = true ;
		int r=0;
		int sum=0;
		int temp=n;
		
		String s1 = Integer.toString(n);
		int digitcount= s1.length();
		while(n!=0) {
			r=n%10;
			n=n/10;
		    sum=(int)(sum+Math.pow(r, digitcount));
		    
		}
		
	
	
		if(sum==temp) {
			return true;
		}
				
	
	return false;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if(status) {
			System.out.println("the given number is Armstrong");}
			else {
				System.out.println("the given number is not Armstrong");

			}
			
		}
	}

 
