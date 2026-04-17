package com.Oops3;

public class Main extends VendingMachine{


		public static void main(String[] args) {
			Item i1 = new Item("chips",50,121);
			Item i2 = new Item("juice",50,471);


			Main t = new Main();
			t.insertCoins(5);
			t.buyItem(i1);
//			t.insertCoins(50);
//			t.buyItem(i2);


		}


	}


