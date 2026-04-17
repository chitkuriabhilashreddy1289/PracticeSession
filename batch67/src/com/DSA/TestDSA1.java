package com.DSA;

import java.util.Scanner;

public class TestDSA1 {
	static void search(int[] arr, int key) {
		boolean found=false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				System.out.println("key Index:" + i);
				found=true;
			}
		}
		if(!found){
			System.out.println("key not found");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 15, 18, 14, 19, 16, 13 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key");
		int key = sc.nextInt();
         search(arr, key);

	}

}
