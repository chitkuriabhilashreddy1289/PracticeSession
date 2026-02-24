package com.Arrays;

public class TestDemoarr {

	public static void main(String[] args) {
        int num[]= {45,67,87,98,97,76};
          int sum=0;
           double avg =0;
          for (int n:num) {
        	  sum+=n;
        	  avg=sum/num.length;
          }
         System.out.println("sum of arraylist:"+ sum);
         System.out.println("average of arraylist:"+ avg);

	}

}
