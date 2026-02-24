package com.ExceptionHandling;

public class EXceptionPropagation {
	static void method1(){
		System.out.println("method 1 started");
		try {
			method2();
		}finally {
			System.out.println("method1 finally block excuted");
		}
	}
	
	static void method2(){
		System.out.println("method 2 started");	
		try {
			method3();
		}finally {
			System.out.println("method2 finally block excuted");
		}
	}
	static void method3(){
		System.out.println("method 3 started");
		try {
			System.out.println(10/0);
		}finally {
			System.out.println("method3 finally block excuted");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			method1();
		}catch(ArithmeticException e) {
			System.out.println("Exception handled in main");
			System.out.println(e.getMessage());
		}
		System.out.println("main ended"); 

		
			
		}

	

}
