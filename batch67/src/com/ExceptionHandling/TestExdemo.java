package com.ExceptionHandling;

public class TestExdemo {

	public static void main(String[] args) {
          try {
        	  System.out.println("1");
        	  //System.exit(0);
        	  //return;
        	 System.out.println(10/0);
          }catch(ArithmeticException e) {
        	  System.out.println("2");
        	  //System.exit(0);
          }finally {
        	  System.out.println("3");
        	  System.exit(0);
          }
          System.out.println("main end");
	}

}
