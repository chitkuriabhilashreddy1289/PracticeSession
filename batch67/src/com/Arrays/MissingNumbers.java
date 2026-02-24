package com.Arrays;

 import java.util.Arrays;
 
public class MissingNumbers {

	public static void main(String[] args) {
		int[]arr= {1,3,5,17,6};
		  Arrays.sort(arr);
		  for(int i=0;i<arr.length-1;i++) {
			  int diff=arr[i+1]-arr[i];
			  while(diff>1) {
				  System.out.println(arr[i]+1+"  ");
				  diff--;
				  arr[i]++;
			  }
		  }
		
	}
}
