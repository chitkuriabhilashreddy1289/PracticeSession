package com.Loops;

public class Alphabets {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Upper case:");
		for (char i = 'A'; i <= 'Z'; i++) {

			System.out.print(i + ",");

		}
		System.out.println("");
		System.out.println("Lower case:");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + ",");
		}
		System.out.println("Alphabets along with numbers");
		int i =1;
		  for (char j = 'A'; j <= 'Z'; j++,i++) {
		 
	 System.out.println(j+"->"+i); }
	
	}

}
