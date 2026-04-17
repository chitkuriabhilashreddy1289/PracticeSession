package com.contructors;

public class A {
	static {
		System.out.println("A");
	}

	A() {
		System.out.println("B");
	}

	A(int x) {
		this();
		System.out.println("A");
	}

	class B extends A {
		B() {
			super(15);
			System.out.println("D");
		}
		class c extends B{
			c(){
				super();
				System.out.println("B1");

			}

		}
	}


	public static void main(String args[]) {
       A obj=new A();
	}

}
