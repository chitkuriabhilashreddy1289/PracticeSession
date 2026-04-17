package com.Multilevelhierarchy;

public class Vehicle {
	String type;

	Vehicle(String type) {
		this.type = type;

	}
}

class Car extends Vehicle {
	String brand;

	Car(String type, String brand) {
		super(type);
		this.brand = brand;

	}
}

class ElectricBus extends Car {
	int batterycapacity;

	ElectricBus(String type, String brand, int batterycapacity) {
		super(type, brand);

		this.batterycapacity = batterycapacity;

	}

	void display() {
		System.out.println("Type of vehicle" + type);
		System.out.println("Type of car" + type);
		System.out.println("BateryCapacity" + batterycapacity+"kwh");
	}

	public static void main(String[] args) {
		ElectricBus v1 = new ElectricBus("petrol", "tata", 700);
		v1.display();

	}
}
