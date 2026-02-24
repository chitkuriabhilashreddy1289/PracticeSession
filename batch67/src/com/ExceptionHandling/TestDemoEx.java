package com.ExceptionHandling;

public class TestDemoEx {

	public static void main(String[] args) {
		System.out.println("main mathod started");
		String str = "Abhi";
		String s1 = null;
		String s2 = "null";
		try {	
		System.out.println(str.length());
	
		System.out.println(s1.length());
		
		System.out.println(s2.length());
	}catch(NullPointerException e){
		System.out.println("gaqj");
		
	}
		try {
			System.out.println("in try");
		} catch (ArithmeticException e) {
			System.out.println("catch in");
			e.printStackTrace();

		}
	}

}
