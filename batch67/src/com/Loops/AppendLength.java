package com.Loops;

public class AppendLength {

	public static void main(String[] args) {
		int[] arr = { 25, 2, 226, 1, 8, 46 };
		for (int i = 0; i < arr.length - 1; i++) {
			int num = arr[i];
			int length = String.valueOf(num).length();
			System.out.println(num+""+length);
		}
	}

}
