package com.Loops;

public class Operators {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

		}
		System.out.println("************************");
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);

		}
		System.out.println("************************");
		
		for(int i = 2;i<=100;i+=2) {
			System.out.println(i);
		}
		
		for(int i= 10,j=45,y=73; i<=20 && j<=55&&y<=83;i++,j++,y++) {
			System.out.println("print i:"+i+" "+"print j:"+j+" "+"print y:"+y);
			
		}
	}

}
