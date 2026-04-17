package com.Arrays;

public class ThreeDimension {

	public static void main(String[] args) {

		   int[][][]arr= {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{1,3,4},{7,8,9}},{{1,2,3,},{4,5,6},{5,6,7}}};

           for (int[][] element : arr) {
        	   for(int j=0;j<element.length;j++) {
        		   for(int k=0;k<element[j].length;k++) {
        			   System.out.print(element[j][k]+" ");
        		   }
                   System.out.println();

        	   }
        	   System.out.println();
           }
	}

}


