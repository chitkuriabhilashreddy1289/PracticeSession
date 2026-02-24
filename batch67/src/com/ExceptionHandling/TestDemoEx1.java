package com.ExceptionHandling;

public class TestDemoEx1 {
	public static void main(String[] args) {
		String str="Abhilash";
		try {
			System.out.println(str.charAt(4));
		System.out.println(str.charAt(8));
	}catch(IndexOutOfBoundsException s) {
		System.err.println(s.getMessage());
	}
	}

}
