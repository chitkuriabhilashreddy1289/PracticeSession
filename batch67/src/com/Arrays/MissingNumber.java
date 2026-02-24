package com.Arrays;

public class MissingNumber {
	   static int findmissingnumber(int [] arr,int n) {
		   int expectedsum = n*(n+1)/2;// sum of Expected sum
		   int actualsum = 0;//sum of given array
		   for(int number:arr) {
			   actualsum+=number;
			   
		   }
		   //  missing number of  given array
			return expectedsum-	 actualsum;  
	   }

	public static void main(String[] args) {
          int [] arr= {1,2,3,4,6}; //given array
           int n = arr.length+1;// To find the last number of the array 
           int missingnumber = findmissingnumber(arr,n);
        	  System.out.println("missingnumber:"+missingnumber); 
           }
            
	}


