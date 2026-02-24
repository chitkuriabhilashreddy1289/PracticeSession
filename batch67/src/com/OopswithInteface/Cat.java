package com.OopswithInteface;

public class Cat implements Animal {
	@Override
	public void Eat() {
		System.out.println("cat can eat");
	}

	

	public void Run() {
		System.out.println("cat can run");

	}

	public void Sound() {
 System.out.println("cat sounds like meow meow");
	}

	public void Sleep() {
 System.out.println("cat sleeps at night");
	}
	
}
