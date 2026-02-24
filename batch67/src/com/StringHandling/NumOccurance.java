package com.StringHandling;

public class NumOccurance {

	public static void main(String[] args) {
		String str = "13313133";
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				String str1 = str.substring(0, i) + str.substring(i + 1, str.length());
				int temp = Integer.parseInt(str1);
				if (temp > max) {
					max = temp;
				}
			}
		}
		System.out.println(max);
	}
}