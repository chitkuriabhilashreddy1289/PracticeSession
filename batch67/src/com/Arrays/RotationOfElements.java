package com.Arrays;

public class RotationOfElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = arr.length;

		k = k % n; // safety check

		int[] temp = new int[k];

		// Store first K elements
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		for (int i = k; i < n; i++) {
			arr[i - k] = arr[i];

		}
		for (int i = 0; i < k; i++) {
			arr[n - k + i] = temp[i];
		}
		 System.out.print("Left Rotated Array: ");
	        for (int x : arr) {
	            System.out.print(x + " ");
	        }

	}

}
