package com.comstructors1;

public class Student {
	String name;
	int roll;
	double marks;

	Student(String name, int roll, double marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;

	}

	Student(Student s1, double marks) {
		this.name = s1.name;
		this.roll = s1.roll;
		this.marks = marks;

	}

	void display() {
		System.out.println("name:" + name);
		System.out.println("roll number:" + roll);
		System.out.println("marks:" + marks);
	}

	public static void main(String[] args) {
		Student s = new Student("rohith", 10, 300);
		s.display();

		Student s1 = new Student(s, 200);
		s1.display();

	}

}
