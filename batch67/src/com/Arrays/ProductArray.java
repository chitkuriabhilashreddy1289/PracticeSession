package com.Arrays;

public class ProductArray {

	public static void main(String[] args) {
        int[]arr= {1,2,3,4};
        int mul=1;
        int div=0;
        for (int element : arr) {
        	mul=mul*element;
        }
       System.out.println("product of array:"+mul);
        for (int element : arr) {
        	div=mul/element;
        	System.out.println("Division of each array:"+mul+"/"+element+"="+div);
        }
	}

}
