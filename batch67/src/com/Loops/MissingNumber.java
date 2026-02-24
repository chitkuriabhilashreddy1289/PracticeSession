package com.Loops;

public class MissingNumber {

	public static void main(String[] args) {
       int[]arr= {1,3,5,7,9};
       for(int i=0;i<arr.length-1;i++) {
    		  arr[i]=2*(i+1);
    		  System.out.println(arr[i]);
    	   }
	}
}
