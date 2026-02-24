package com.Oops;

public class LibraryApp {

	public static void main(String[] args) {
		//LibraryApp l=new LibraryApp();
		LibraryMember l1=new DriverClass();  
		l1.setBookName("java");
		l1.setBooksborrowed(5);
		LibraryMember l=new PremiumMember();
		l.setBookName("data science");
		l.setBooksborrowed(7);
		System.out.println("student fee :"+l1.calculatefee());
		System.out.println("student fee :"+l.calculatefee());
		l.setBooksborrowed(4);
		l.setBookName("data science");
		System.out.println("student fee :"+l1.calculatefee());
		System.out.println("student fee :"+l.calculatefee());
	} 
	

}
