package com.Arrays;

public class ProductArray {

	public static void main(String[] args) {
        int[]arr= {1,2,3,4};
        int mul=1;
        int div=0;
        for(int i=0;i<arr.length;i++) {
        	mul=mul*arr[i];
        }
       System.out.println("product of array:"+mul);
        for(int j=0;j<arr.length;j++) {
        	div=mul/arr[j];
        	System.out.println("Division of each array:"+mul+"/"+arr[j]+"="+div);
        }
	}

}
