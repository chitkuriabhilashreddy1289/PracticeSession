package com.ExceptionHandling;

public class TestExDemo1 {

	public static void main(String[] args) {
            int [] arr=new int[4];
            try {
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;
            }
            catch(IndexOutOfBoundsException ar) {
            	ar.printStackTrace();
            }
            for (int element : arr) {
            	System.out.println(element);

            }
            System.out.println("main");
	}

}
