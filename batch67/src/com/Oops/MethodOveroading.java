package com.Oops;

public class MethodOveroading {
	int sum(int a,int b) {
		return a+b;
	}
	double sum(double a,double b,double c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {
		MethodOveroading m=new MethodOveroading();
		System.out.println(m.sum(4, 6));
		System.out.println(m.sum(5.5, 7.5,6.8));
	}

}
