package com.Loops;

import java.util.Scanner;

public class Factorial1 {
	  int findFactorial(int n) {
		 if(n==0||n==1) {
			 return 1;
		 }
		 return n*findFactorial(n-1);
	 }
	

	public static void main(String[] args) {
		Factorial1 f=new Factorial1();
		Scanner sc = new Scanner (System.in) ;
	 System.out.println("Enter limit: ");
	 int num=sc.nextInt();
	  int result=f.findFactorial(num);
	  System.out.println("Factorial of  "+num+":"+result);
}
	}


