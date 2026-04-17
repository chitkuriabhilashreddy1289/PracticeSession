package com.constructors;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index to add");
		int num=sc.nextInt();
		System.out.println("Enter a number");
		int add=sc.nextInt();

		int[]a= {1,3,4,5,6,7};
          int[]b=new int[a.length+1];
          for(int i=0;i<num;i++) {
        	  b[i]=a[i];
          }
         // b[num]=add;
          for(int i=num;i<a.length;i++){
        		 b[i+1]=a[i];
          }
          for(int n:b) {
			System.out.println(n);
		  }
	}

}
