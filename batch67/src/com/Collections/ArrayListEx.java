package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEx {

	public static void main(String[] args) {
		Collection<String> teachers = new ArrayList<>();
		teachers.add("praveen");
		Collection<String> boys = new ArrayList<>();
		boys.add("abhi");
		boys.add("vinay");
		boys.add("sai");
		boys.add("barath");
		boys.add("hanmanth");
		boys.add("harsha");
		boys.add("sridhar");
		System.out.println(boys);
		Collection<String> girls = new ArrayList<>();

		girls.add("Ananya");
		girls.add("Sravani");
		girls.add("Divya");
		girls.add("Priya");
		girls.add("Harini");
		girls.add("Keerthi");
		girls.add("Meghana");

		System.out.println(girls);

		Collection<String> students = new ArrayList<>();

		students.addAll(boys);
		students.addAll(girls);
		System.out.println(girls.contains("Ananya"));
		System.out.println(boys.contains("vijay"));



		System.out.println(boys);
		System.out.println(students);
		System.out.println(students.containsAll(boys));
		System.out.println(students.containsAll(teachers));
		students.removeAll(boys);
		System.out.println("student:"+students);


	}

}
