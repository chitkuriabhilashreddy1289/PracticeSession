package com.comstructors1;

public class Mobile {
	String brand;
	double price;
	String colour;

	Mobile() {
		brand = "oppo";
		price = 15000.0;
		colour = "black";
		System.out.println("no arg constructor called");
	}

	Mobile(String brand, double price) {
		this.brand = brand;
		this.price = price;
		System.out.println("two arg contructor called");

	}

	Mobile(String brand, double price, String colour) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		System.out.println("three arg contructor called");
	}

	void showdetails() {
		System.out.println("Mobile Brand:" + brand);
		System.out.println("Mobile Price:" + price);
		System.out.println("Mobile Colour:" + colour);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Mobile m = new Mobile("realme", 20000.0, "red");
		Mobile m1 = new Mobile("redme", 30000.0, "green");
		Mobile m2= new Mobile("iphone",70000.0,"white");


		m.showdetails();
		m1.showdetails();
		m2.showdetails();

	}

}
