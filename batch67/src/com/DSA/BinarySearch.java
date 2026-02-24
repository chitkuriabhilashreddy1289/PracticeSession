package com.DSA;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 7, 9, 10, };
		int key = 9;

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				System.out.println("Found at index " + mid);
				break;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}

}
