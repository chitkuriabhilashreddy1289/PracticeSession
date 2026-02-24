package com.Arrays;

public class AverageofElements {

	public static void main(String[] args) {
		
	          int[]arr= {3,6,8,7,9,2,1};
	          int sum=0;
	          int count=0;
	          int avg=0;
	          for(int i=0;i<arr.length;i++) {
	        	  sum=sum+arr[i];
	        	  count++;
	        	  avg=sum/count;
	          }
	          System.out.println("Sum of ArrayElements:"+sum);
	          System.out.println("avg of ArrayElements:"+avg);
		}
	}


