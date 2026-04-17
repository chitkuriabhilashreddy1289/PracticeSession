package com.ExceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemoEx2 {

	public static void main(String[] args) {
		try {


     Scanner sc=new Scanner(System.in);
     System.out.println("enter your age");
     int age=sc.nextInt();
     System.out.println("your entered age is :"+age);
	}
		catch(InputMismatchException i) {
			System.out.println("in catch");
		}

}}
