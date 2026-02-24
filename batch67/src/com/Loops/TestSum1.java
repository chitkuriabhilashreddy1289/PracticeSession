package com.Loops;



public class TestSum1 {
	 static int digitSum(int num) {
		 int sum=0;
		 while(num>0) {
			 sum+=num%10;
			 num=num/10;
		 }
		 return sum;
	 }
   	 
   	  

	public static void main(String[] args) {
      int arr[]= {153,167,187,134,185};
     for(int num:arr) {
    	int sum=digitSum(num);
    	 System.out.print(num+""+sum+" ");
     }
      
    
      }
	}


