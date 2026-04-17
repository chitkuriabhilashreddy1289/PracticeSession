package com.Loops;

import java.util.Scanner;

public class AmstrongNumber {
	static int isamstrong(int n) {
		 int sum=0;
		 while(n!=0) {
			n= n%10;
			n=n/10;
			sum=sum+n*n*n;


		 }

		 if(sum==n) {
			 System.out.println("number is amstrong");

		 }
		 else {
			 System.out.println("number is not amstrong");}

		 return sum ;
	 }

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int isamstrong=isamstrong(n);




	}

}
