package com.numbers;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter a number");
          int num =sc.nextInt();
          int sum = 0;
          int mul= 1;
          int digit = 0;
          while(num!=0) {
        	  digit = num%10;
        	  sum = sum+digit;
        	  mul=mul*digit;
        	  num=num/10;
        	  
          }
          if(sum==mul) {
        	  System.out.println("number is a spy");
          }
          else {
        	  System.out.println("number is not a spy");
          }
          }
        	  
	}


