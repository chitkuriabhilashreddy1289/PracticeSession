package com.OopswithInteface;

public class Main {

	public static void main(String[] args) {
        Animal a=new Cat();
        a.Eat();
        a.Sound();
        a.Run();
        a.Sleep();
        a.swim();
        Animal.breath();
        System.out.println();
        Animal d=new Dog();
        d.Eat();
        d.Sound();
        d.Run();
        d.Sleep();
        Animal.breath();
        }
       
}
