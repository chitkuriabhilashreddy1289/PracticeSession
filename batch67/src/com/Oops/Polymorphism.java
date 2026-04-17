package com.Oops;

public class Polymorphism {
	void sound() {
		System.out.println("animal making sound");
	}
}
class Animal extends Polymorphism{

@Override
void sound() {
	System.out.println("dog is barking");
}

	public static void main(String[] args) {
       Polymorphism p=new Animal();
       p.sound();
	}

	}
