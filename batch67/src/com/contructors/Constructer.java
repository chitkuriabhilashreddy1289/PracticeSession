package com.contructors;


	public class Constructer {
		String model;
		String brand;
		double price;
		String color;
		// no arg constructor
		Constructer() {
			System.out.println("no arg constructor called");
			model = "unknown";
			brand = "unknown";
			price = 0;
			color = "unknown";
		}
		// two arg constructor
		Constructer(String model, String brand) {
			this.model = model;
			this.brand = brand;
		}
		Constructer(String model, String brand, double price) {
			this.brand = brand;
			this.model = model;
			this.price = price;
		}
		Constructer(String model, String brand, double price, String color) {
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
			Constructer c = new Constructer();
			c.display();
			Constructer c1 = new Constructer("Sonet", "KIA");
			c1.display();
			Constructer c2 = new Constructer("Seltos", "KIA", 1600000.00);
			c2.display();
			Constructer c3 = new Constructer("Nexon", "TATA", 1000000.00, "White");
			c3.display();
			System.out.println("main method ended !");
		}
	}

