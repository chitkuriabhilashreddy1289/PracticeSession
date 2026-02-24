package com.ExceptionHandling;

public class TestDemoEx3 {

	public static void main(String[] args) {
       try {
    	   System.out.println("try");
    	   System.out.println(10/2);
    	   System.out.println(0.0/0.0);//NAN
    	   System.out.println(10.5/0);//Infinity
    	   System.out.println(10.5/0.0);//Infinity
    	   
       }catch(ArithmeticException ar){
    	   System.out.println("1");
       }catch(IndexOutOfBoundsException s) {
    	   System.out.println("2");
       }catch(NullPointerException e) {
    	   System.out.println("3");
    	   
       
    	   
       }
       
	}

}
