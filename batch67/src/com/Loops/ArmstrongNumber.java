package com.Loops;

import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isArmstrongNumber(int num) {
		boolean flag = false;
		int rem = 0;
		int sum = 0;
		int temp = num;
		String s1= Integer.toString(num);
		int digitcount = s1.length();
		
		while(num!=0) {
			rem=num%10;
			sum=(int)(sum+Math.pow(rem,digitcount));
			num=num/10;
			
		}
		if(sum==temp) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean status = (isArmstrongNumber(num));
		
		if (status) {
			System.out.println("Given Number is Armstrong");
		} else {
			System.out.println("Given Number is not Armstrong");

		}
	
	}
	
}