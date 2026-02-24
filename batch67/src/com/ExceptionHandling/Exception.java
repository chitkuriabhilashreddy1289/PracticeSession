package com.ExceptionHandling;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
       System.out.println("main method started");
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter value of a");
       int a=sc.nextInt();
       
       System.out.println("Enter value of b");
       int b=sc.nextInt();
       try {
       System.out.println(a/b);       
       }
       catch(ArithmeticException e){
    	   System.out.println("catch in");
    	   e.printStackTrace();
    	   
       }
	}

}
