package com.Oops;

import java.util.Scanner;

import com.Arrays.Arrays;


public class NumbersInAssending {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
	      int num=sc.nextInt();//7569782221;
		   int digit=0;
		  for(int i=0;i<=10;) {
			  digit=num%10;
			  
			 num=num/10;
		   }
	}

}
