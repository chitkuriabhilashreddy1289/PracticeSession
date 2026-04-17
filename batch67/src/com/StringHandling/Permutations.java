package com.StringHandling;

import java.util.Scanner;

public class Permutations {


	    // Function to generate permutations
	    static void permute(char[] arr, int l, int r) {
	        if (l == r) {
	            System.out.println(String.valueOf(arr));
	        } else {
	            for (int i = l; i <= r; i++) {
	                // Swap
	                swap(arr, l, i);

	                // Recursive call
	                permute(arr, l + 1, r);

	                // Backtrack (swap back)
	                swap(arr, l, i);
	            }
	        }
	    }

	    // Function to swap two characters
	    static void swap(char[] arr, int i, int j) {
	        char temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        String str=sc.next();
	        char[] arr = str.toCharArray();
	        permute(arr, 0, arr.length - 1);
	    }
	}



