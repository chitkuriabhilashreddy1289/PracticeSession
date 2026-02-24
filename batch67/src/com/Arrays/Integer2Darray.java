package com.Arrays;

public class Integer2Darray {

	public static void main(String[] args) {
		int [][]name=new int[3][3];
		name[0][0]=50;
		name[1][1]=100;
		name[2][2]=200;
		for(int i = 0;i<name.length;i++) {
			for(int j = 0;j<name[i].length;j++) {
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}

	}


	}


