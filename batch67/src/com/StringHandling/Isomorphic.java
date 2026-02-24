package com.StringHandling;

import java.util.Scanner;

public class Isomorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text");
		String str1 = sc.next();

		System.out.println("Enter a text");
		boolean s = true;
		String str2 = sc.next();
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			char c1 = str2.charAt(i);
			if(str1.length()!=str2.length()) {
				s= false;
			}

			if (str1.indexOf(c) != str2.indexOf(c1) || str1.lastIndexOf(c) != str2.lastIndexOf(c1)) {
				s = false;
				break;
			}
		}

		if (s) {
			System.out.println("isomorphic");
		} else {
			System.out.println("not");
		}

	}

}
