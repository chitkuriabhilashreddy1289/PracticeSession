package com.Arrays1;

import java.util.Scanner;

public class DeleteArrayIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index to remove:");
		int IndexToRemove = sc.nextInt();
		for (int i = IndexToRemove; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = 0;
		for (int n : arr) {
			System.out.println(n);
		}
	}

}
