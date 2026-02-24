package com.DSA;

import java.util.Scanner;

public class RecursiveBinarySearch {
	  static int binarySearch(int[]arr,int low,int high, int key) {
		  while(low<=high) {
			  int mid=(low+high)/2;
			  if(arr[mid]==key) {
				 return mid;
			  }
			  else if(key<arr[mid]) {
				  return binarySearch(arr,low,mid-1,key);
			  }
			  else {
				  return binarySearch(arr,mid+1,high,key);
			  }
		  }
		  return -1;
	  }

	public static void main(String[] args) {
          int[]arr= {1,2,3,4,5,6,7,8};
          Scanner sc =new Scanner(System.in);
          System.out.println("enter a key to search");
          int key=sc.nextInt();
          int result=binarySearch(arr,0,arr.length-1,key);
          if(result!=-1){
        	  System.out.println("key Index:"+result);
          }
          else {
        	  System.out.println();
          }
	}

}
