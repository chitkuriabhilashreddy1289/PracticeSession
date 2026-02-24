package com.Loops;

import java.util.Scanner;

public class ToPrintTable {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number1 ");
       int n = sc.nextInt();
       System.out.println("Enter a number2");
       int r = sc.nextInt();
       int result=0;
       for(int i=1;i<=r;i++) {
    	   result = n*i;
    	   System.out.println(n+"x"+i+"="+result);
       }
       sc.close();
	}

}
