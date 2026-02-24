package com.Arrays;

public class CopyArray {

	public static void main(String[] args) {
    int []arr= {1,2,3,4,5,6,7};
         int[]temp= new int[arr.length];
         for(int i=0;i<arr.length;i++) {
        	temp[i]= arr[i];
         }
        for(int n:temp) {
        	System.out.print(n+" , ");
       }
    
	}
}