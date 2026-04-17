package com.Loops;

import java.util.Scanner;

public class PrimeNumbers1 {

	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter to print primenumbers ");
          int num=s.nextInt();

          for(int n=2;n<=num;n++) {
        	   boolean isPrime =true;
        	   for(int i=2;i*i<=n;i++) {

        		   if(n%i==0) {
        			   isPrime=false;
        			  // break;
        		   }
        	   }
        	   if(isPrime) {
        		System.out.println("prime numbers:"+n);
        	   }
          }
	}

}
