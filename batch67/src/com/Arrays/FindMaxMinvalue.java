package com.Arrays;

public class FindMaxMinvalue {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 8, 7, 9, 2, 1 };
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

		}
		System.out.println(arr[min]);
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					max = j;
				}
			}

		}
		System.out.println(arr[max]);
		
	}
}
