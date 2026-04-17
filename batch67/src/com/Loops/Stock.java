package com.Loops;

public class Stock {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 11, 19, 27, 13,2 };
		for (int element : arr) {
			for(int j=1;j<arr.length-1;j++) {
			int	diff=element-arr[j];
			System.out.println(diff);
			System.out.println();
			}

		}


	}

}
