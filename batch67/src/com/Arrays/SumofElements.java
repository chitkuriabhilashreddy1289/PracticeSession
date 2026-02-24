package com.Arrays;

public class SumofElements {

	public static void main(String[] args) {
          int[]arr= {3,6,8,7,9,2,1};
          int sum=0;
          for(int i=0;i<arr.length-1;i++) {
        	  sum=sum+arr[i];
          }
          System.out.println("Sum of ArrayElements:"+sum);
	}

}
