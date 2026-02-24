package com.Assignment;

public class Item {
	int price;
	String name;
	int code;

	Item(int price, String name, int code) {
		this.name = name;
		this.price = price;
		this.code = code;

	}

	boolean isFree() {
		if (isPalindrome()) {
			System.out.println("you got free item");
			return true;
		}
		return false;
	}

	boolean isPalindrome() {
		int rev = 0;
		int num = code;
		while (code != 0) {
			num=code%10;
			rev=rev*10+num;
			code=code/10;
			if(rev==num) {
				return true;
			}
		}

		return false;
	}
}