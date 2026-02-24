package com.Arrays;

public class ArraysPractise {

	public static void main(String[] args) {
        int number[]={1,2,3,4,5,6};
         double sum=0;
         double avg=0;
          for(int i = 0;i<=number.length;i++) {
        	  sum=sum+i;
        	  avg=sum/number.length;
        	  
          }
       System.out.println( "sum of array elements:"+ sum);
       System.out.println( "average of array elements:"+ avg);
	}

}
