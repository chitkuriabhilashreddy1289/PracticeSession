package com.contructors;

public class Car {


	String model;
	String brand;
	double price;
	String color;
	// no arg constructor
	Car() {
		System.out.println("no arg constructor called");
		model = "unknown";
		brand = "unknown";
		price = 0;
		color = "unknown";
	}
	Car(String model){
		this.model = model;
		System.out.println("one arg constructor called");
		
	}
	// two arg constructor
	Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
		System.out.println("two arg constructor called");
		
	}
	Car(String model, String brand, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	Car(String model, String brand, double price, String color) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}
	void display() {
		System.out.println("********************************");
		System.out.println("Model Of the  Car : " + model);
		System.out.println("Brand of teh Car : " + brand);
		System.out.println("Price of the car : " + price);
		System.out.println("Color of the color : " + color);
	}
	public static void main(String[] args) {
		System.out.println("main method started !");
		Car c = new Car();
		c.display();
		Car c1 = new Car("Sonet");
		c1.display();
		Car c2 = new Car("Seltos", "KIA", 1600000.00);
		c2.display();
		Car c3 = new Car("Nexon", "TATA", 1000000.00, "White");
		c3.display();
		System.out.println("main method ended !");
	}
}

