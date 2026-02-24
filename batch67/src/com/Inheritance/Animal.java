package com.Inheritance;

public class Animal {
	void eat() {
		System.out.println("animal is eating ");
	}
}

class dog extends Animal {
	void bark() {
		System.out.println("dog is barking");
	}
}

class animal {

	public static void main(String[] args) {
		dog d = new dog();
		d.eat();
		d.bark();

	}
}
