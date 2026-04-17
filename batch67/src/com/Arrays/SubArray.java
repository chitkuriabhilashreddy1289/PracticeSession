package com.Arrays;

public class SubArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 0, 1, 1, 0 };

		int max = -1;


		for (int i = 0; i < arr.length; i++) {
			int count0 = 0;
			int count1 = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0) {
					count0++;
				} else {
					count1++;
				}
				if (count0 == count1) {
					int length = j - i + 1;
					max = Math.max(max, length);
				}
			}
		}
		System.out.println(":" + max);

	}
}
