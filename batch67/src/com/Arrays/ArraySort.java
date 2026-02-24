package com.Arrays;

public class ArraySort {

	public static void main(String[] args) {
           int []arr= {2,5,6,8,7,9,1,3,4};
           int temp=0;
           //int []temp=new int[arr.length];
           for(int i=0;i<arr.length-1;i++) {
        	   for(int j=0;j<arr.length-1-i;j++) {
        		   if(arr[j]>arr[j+1]) {
        			temp=arr[j+1];
        			arr[j+1]=arr[j];
        			arr[j]=temp;
        			   
        			
        		   }
        	   }
           }
           for(int n:arr) {
        	   System.out.println(n);
           }
	}

}
