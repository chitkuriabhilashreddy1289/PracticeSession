package com.comstructors1;

public class student1 {
	String name;
	int roll;
	double marks;
	student1(String name){
		this.name = name;
	}
	student1(student1 s1, int roll){
		this.name = s1.name;
		this.roll = roll;
	}
	student1(student1 s1, double marks ){
		this.name = s1.name;
		this.roll = s1.roll;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("name : " + name);
		System.out.println("roll number : " + roll);
		System.out.println("marks : " + marks);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		student1 s1 = new student1("rohith");
		s1.display();
		
		student1 s2 = new student1(s1, 10);
		s2.display();
		
		student1 s3 = new student1(s2, 300);
		s3.display();

	}

}
