package com.Assignment;

public class Vendingmachine {
	int coins=0;

	void insertCoin(int newcoins) {
		coins += newcoins;
		System.out.println("Inserted coins:" + newcoins);
		System.out.println("total coins:" + coins);

	}

	void buyItem(Item i) {
		System.out.println("trying to buy:" + i.name);
		if (i.isFree()) {
			System.out.println("magic code item is free");
		} else if (coins >= i.price) {
			coins -= i.price;
			System.out.println("Item purchased for:" + i.price);
			System.out.println("remaining balance:" + coins);
		} else {
			System.out.println("Not enough balance");
		}
	}
}




