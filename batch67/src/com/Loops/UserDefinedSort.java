package com.Loops;

public class UserDefinedSort {

	public static void main(String[] args) {
		int[] arr = { 17, 16, 15, 19, 1, 2, 3, 5, 6 };
		int temp = 0;
		int middle = arr.length / 2;
		for (int i = 0; i < arr.length/2; i++) {
			for (int j = i + 1; j < arr.length/2; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}

		}
		for (int i =middle+1 ; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp1 = arr[j];
					arr[j] = arr[i];
					arr[i] = temp1;

				}
			}

		}
		for(int n:arr) {
			System.out.print(n+"  ");
		}

	}
}
