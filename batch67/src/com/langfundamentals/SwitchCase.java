package com.langfundamentals;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your age");
     int age =sc.nextInt();
     switch(age) {
     case 28 ->
    	 System.out.println("1997 born");
     case 27 ->
	 System.out.println("1998 born");
     case 26 ->
	 System.out.println("1999 born");
     case 25 ->
	 System.out.println("2000 born");
     case 24 ->
	 System.out.println("2001 born"); 
     case 23 ->
	 System.out.println("2002 born");
	 
     }
     
     sc.close();
	}

}
