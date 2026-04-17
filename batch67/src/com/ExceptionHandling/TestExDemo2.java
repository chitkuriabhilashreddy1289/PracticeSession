package com.ExceptionHandling;

import java.util.Scanner;

public class TestExDemo2{

	public static void main(String[] args) throws ChanduException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();

		if(age<18) {
			throw new ChanduException("babu niku inka time undi ra");
		}

	}

}
