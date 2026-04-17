package com.Arrays;

public class String2Darray {

	public static void main(String[] args) {
		String [][]name=new String[3][3];
		name[0][0]="Abhi";
		name[1][1]="vinay";
		name[2][2]="praveen";
		for (String[] element : name) {
			for(int j = 0;j<element.length;j++) {
				System.out.print(element[j]+" ");
			}
			System.out.println();
		}

	}

}
