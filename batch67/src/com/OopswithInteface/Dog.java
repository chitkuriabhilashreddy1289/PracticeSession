package com.OopswithInteface;

public class Dog implements Animal{
	@Override
	public void Eat() {
		System.out.println("Dog can eat");
	}



	@Override
	public void Run() {
		System.out.println("Dog can run");

	}

	@Override
	public void Sound() {
 System.out.println("Dog sounds like baow baow");
	}

	@Override
	public void Sleep() {
 System.out.println("Dog sleeps at night");
	}

}
