package com.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
         int [] arr= {1,2,3,4,5,6,7};
         int temp = 0;
         int count=0;
         for(int i =0;i<arr.length;i++) {
        	 boolean flag=false;
        	 for(int j=0;j<arr.length-1-i;j++) {
        		 if(arr[j]<arr[j+1]) {
        			 temp=arr[j];
        			 arr[j]=arr[j+1];
        			 arr[j+1]=temp;
        			 flag=true;
        		 }
        		 count++;
        		  
        	 }
        	 if(!flag) {
        		 break;
        	 }
        	 
         }
         for(int a:arr) {
        	 System.out.println(a+" ");
         }
         System.out.println( "count:"+count);
	}

}
