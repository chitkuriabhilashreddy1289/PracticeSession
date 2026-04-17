package com.Loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num =sc.nextInt();
    int ch=0;
        int sum = 0;
    int digit = 0;
    while(ch<10) {

    while(num!=0) {
  	  digit = num%10;
  	  sum = sum+digit;
  	  num=num/10;
   ch=sum;

  }
    }
    if(ch==1) {
  	  System.out.println("number is a magic");
    }
    else {
  	  System.out.println("number is not a magic");
    }
    }
}