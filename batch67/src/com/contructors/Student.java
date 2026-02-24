package com.contructors;

class Address{
	String city;
	Address( String city){
		this.city=city;
	}
}

public class Student{
	String name;
	Address address;
	Student(String name,Address address){
		this.name=name;
		this.address=address;
		
	}
	Student(Student s){
		this.address=s.address;
		this.name=s.name;
	}

	public static void main(String[] args) {
		Address ad=new Address("Hyderabad");
		Student s1=new Student("Vinay",ad);
		Student s2=new Student(s1);
		s2.address.city="Bangalore";
		System.out.println(s1.address.city);
		
		
	}

}
