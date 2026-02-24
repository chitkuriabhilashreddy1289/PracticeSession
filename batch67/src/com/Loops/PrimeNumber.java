package com.Loops;

import java.util.Scanner;

public class PrimeNumber {
	 static boolean isprime(int n) {
		 boolean flag = true;
		 if(n==0||n==1)
			 return false;
		 for(int i=2;i<n/2;i++) {
			 if(n%i==0) {
				 flag= false;
				 break;
			 }
		 }
		 return flag;
	 } 

	

	 static void primenumbers(int num) {
		   for(int i = 0;i<=num;i++)
		   {
			   if(isprime(i)) {
				  System.out.println(i+" ");
			   }
		   }
		   }
	  
	
		public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
          int num= sc.nextInt();
           primenumbers(num);
       
        	  
        	 
        	  
        	  
          
          
          }

}
