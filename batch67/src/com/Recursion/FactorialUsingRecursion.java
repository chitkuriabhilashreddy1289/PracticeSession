package com.Recursion;

import java.util.Scanner;
       

public class FactorialUsingRecursion {
	static int findfactorial(int num) {
 	   if(num==0||num==1) {
 		   return 1;  
 	   }
 	   return num*findfactorial(num-1);
     	 
     }

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num= sc.nextInt();
            int fact=findfactorial(num);
            System.out.println(fact);
            
            sc.close();
            
	}

}
