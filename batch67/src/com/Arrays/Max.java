package com.Arrays;

public class Max {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 8, 7, 9, 2, 1 };
         int maximum=0;
		for (int i = 0; i < arr.length; i++) {
			//max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					maximum = j;
				}
			}

		}
		System.out.println(arr[maximum]);

	}

}
