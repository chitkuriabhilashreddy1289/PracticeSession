package com.ExceptionHandling;


public class MultipleExceptions {

	public static void main(String[] args) {
		try {
			System.out.println("try1");
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("catch1");
		}finally {
			System.out.println("finally1");
		}
		try {
			System.out.println("try 2");
			System.out.println(10/0);
			
		}catch(Throwable e) {
			
		}

		}

}
