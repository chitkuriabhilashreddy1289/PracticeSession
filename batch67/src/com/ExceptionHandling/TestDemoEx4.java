package com.ExceptionHandling;

public class TestDemoEx4 {

	public static void main(String[] args) {
         try {
        	 System.out.println("intry");
        	 System.out.println(10/0);
        	 String s=null;
        	 System.out.println(s.length());
         }catch(ArithmeticException |NullPointerException n) {
        	 System.out.println(" in catch 1");
        	 System.out.println(n.getMessage());
         }
	}

}
