package com.Arrays;

public class ThreeDimensionArray {

	public static void main(String[] args) {
      int[][][]arr= {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{1,3,4},{7,8,9}},{{1,2,3,},{4,5,6},{5,6,7}}};
     
           for(int [][]n2:arr) {
        	   for(int[]n1:n2) {
        		   for(int n:n1) {
        			   System.out.print(n+" ");
        		   }
                   System.out.println();

        	   }
        	   System.out.println();
           }
	}

}
