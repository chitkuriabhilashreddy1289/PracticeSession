package com.Methods;

import java.util.Scanner;

public class WithreturnWitharguments {
	double areaofrectangle(double length,double breadth) {
   	 return length*breadth;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a length of rectangle");
		double n1=sc.nextInt();
		System.out.println("enter a breadth of rectangle");
		double n2=sc.nextInt();
		WithreturnWitharguments t1=new WithreturnWitharguments();
		double area =t1.areaofrectangle(n1,n2);
		System.out.println("Area of Rectangle:"+area);




		}

	}


