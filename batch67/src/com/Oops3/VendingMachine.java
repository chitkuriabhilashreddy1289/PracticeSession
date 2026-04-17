package com.Oops3;

public class VendingMachine {

	        int coins=0;

		void insertCoins(int c) {
			coins=coins+c;
			System.out.println("Insert coins:"+c);
			System.out.println("Total coins:"+coins);

		}
		void buyItem(Item i) {
			if(i.isfree()) {
				System.out.println("Item is free");
				System.out.println("Item Dispensed:"+i.name);
			}else if(coins>=i.price) {
				coins=coins-i.price;
				System.out.println("Item purchase:"+i.name);
				System.out.println("Remaining coins:"+coins);
			}else {
				System.out.println("you dont have enough coins to buy "+i.name);
			}
		}

	}


