package com.Oops;


public class OverLoading {
	 public  double getArea(double r) {
  	   System.out.println("called4");
  	   return 3.14*r*r;
	 }
	 public  double getArea(int b,int l) {
	  	   System.out.println("called");
	  	   return l*b;
		 }
	 public  double getArea(double b,double l) {
	  	   System.out.println("called1");
	  	   return l*b;
		 }
	 public  double getArea(float b,double h) {
	  	   System.out.println("called2");
	  	   return 0.5*b*h;
		 }
	 public  double getArea(float s) {
	  	   System.out.println("called3");
	  	   return s*s;
		 }
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		System.out.println(o.getArea(6d));
		System.out.println(o.getArea(6f));
		System.out.println(o.getArea(6));
		System.out.println(o.getArea(6));

		System.out.println(o.getArea(6d));
		System.out.println(o.getArea(6d,7f));

		System.out.println(o.getArea(6d));
		o.getArea(5.0,6);
		o.getArea(6f);


       }
	}


