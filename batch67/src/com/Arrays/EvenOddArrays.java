package com.Arrays;

public class EvenOddArrays {

	public static void main(String[] args) {
		int[] arr = { 21,5,7,9,3,6,8,9 };
		int even = 0;
		int odd = 0;
		for (int element : arr) {
			//even = arr[i];
			if (element % 2 == 0) {
				System.out.print("even:"+element+" ");}
			else {
				System.out.print("Odd:"+element+" ");

			}
		}
	}

}
