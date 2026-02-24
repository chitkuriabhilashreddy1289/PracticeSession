package com.Operators;

public class BitwiseOperators {

	public static void main(String[] args) {

		int a = 7;

		System.out.println("Bitwise And(&)");
		System.out.println(90 & 67);
		System.out.println(89 & 900);
		System.out.println(49 & 78);

		System.out.println("******************");
		System.out.println("Bitwise OR(|)");

		System.out.println(67 | 27);
		System.out.println(89 | 89);
		System.out.println(68 | 89);
		System.out.println(~a);

		System.out.println("*****************");
		System.out.println("Bitwise xor(^)");

		System.out.println(67 ^ 57);
		System.out.println(89 ^ 89);
		System.out.println(68 ^ 89);

	}

}
