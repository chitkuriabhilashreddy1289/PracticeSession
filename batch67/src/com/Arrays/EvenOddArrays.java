package com.Arrays;

public class EvenOddArrays {

	public static void main(String[] args) {
		int[] arr = { 21,5,7,9,3,6,8,9 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			//even = arr[i];
			if (arr[i] % 2 == 0) {
				System.out.print("even:"+arr[i]+" ");}
			else {
				System.out.print("Odd:"+arr[i]+" ");

			}
		}
	}

}
