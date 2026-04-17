package com.Loops;

import java.util.Scanner;

public class BinaryNumber {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		 String str="";
		  int rem=0;
		  while(num!=0) {
			rem=num%2;
		    num=num/2;
			str=rem+""+str;

		  }
		  System.out.println(str);


	}

}
