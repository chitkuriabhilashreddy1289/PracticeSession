package com.Arrays;

public class String2Darray {

	public static void main(String[] args) {
		String [][]name=new String[3][3];
		name[0][0]="Abhi";
		name[1][1]="vinay";
		name[2][2]="praveen";
		for(int i = 0;i<name.length;i++) {
			for(int j = 0;j<name[i].length;j++) {
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}

	}

}
