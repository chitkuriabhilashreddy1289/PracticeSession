package com.Arrays;

public class LoopInsideLoop {

	public static void main(String[] args) {
		 int [][]arr= {{1,2,3},{1,2,3},{1,2,3},{1,2,3,4,5,6}};
         for (int[] element : arr) {
         	for(int j = 0;j<element.length;j++) {
         		System.out.print(element[j]+"  ");
         	}
         	System.out.println();
         }
	}

}
