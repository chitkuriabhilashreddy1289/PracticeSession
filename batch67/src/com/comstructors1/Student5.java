package com.comstructors1;

class Address{
	String city;
	Address( String city){
		this.city=city;
	}
}

public class Student5{
	String name;
	Address address;
	Student5(String name,Address address){
		this.name=name;
		this.address=address;

	}
	Student5(Student5 s){
		this.address=new Address(s.address.city);
		this.name=s.name;
	}

	public static void main(String[] args) {
		Address ad=new Address("Hyderabad");
		Student5 s1=new Student5("Vinay",ad);
		Student5 s2=new Student5(s1);
		s2.address.city="Bangalore";
		System.out.println(s1.address.city);


	}

}

