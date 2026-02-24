package com.Assignment;

public class Main {

	public static void main(String[] args) {
        Item  item1=new Item(40,"Pizza",151);
        Item  item2=new Item(80,"burger",155);
        
        Vendingmachine v=new Vendingmachine();
        v.insertCoin(50);
        v.buyItem(item1);
//        v.insertCoin(100);
//        v.buyItem(item2);
        
	}

}
