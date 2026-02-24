package com.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 40, 50, 7, 58, 90 ,6};
		int min = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
				
			}
			

		for (int n : arr) {
			System.out.println(n);
		}
	
	}
}
