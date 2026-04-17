package com.OopswithInteface;

public interface Animal {
	void Eat();

	void Run();

	void Sound();

	void Sleep();

	default void swim() {
		System.out.println(" animals can Swim");
	}
    static void  breath () {
    	System.out.println("all animals can breath");

    }



}
