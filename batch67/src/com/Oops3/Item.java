package com.Oops3;

public class Item {
	String name;
	int price;
	int code;

	public Item(String name, int price, int code) {
		this.name = name;
		this.price = price;
		this.code = code;
	}

	boolean isfree() {
		if (ispalindrome()) {
			System.out.println("You got free item");
			return true;
		}
		return false;
	}

	boolean ispalindrome() {
		int temp = code;
		int sum = 0;
		while (code != 0) {
		   temp= code % 10;
		   sum = sum * 10 + temp;
			code = code / 10;


		if (temp == sum) {
			return true;
		}
		}
		return false;

	}
}


