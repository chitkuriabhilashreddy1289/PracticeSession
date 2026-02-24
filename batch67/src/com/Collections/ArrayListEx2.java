package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEx2 {

	public static void main(String[] args) {
		Collection<Float> marks1 = new ArrayList<>();
		Collection<Float> marks = new ArrayList<>();
		marks.add(59.9f);	
		Collection<Double> temp= new ArrayList<>();
		temp.add(59.9);		
		Collection<Integer> in = new ArrayList<>();
		in.add(59);
		Collection<Byte> by = new ArrayList<>();
		by.add((byte) 59.9f);		
		Collection<Float> flt = new ArrayList<>();
		flt.add((float)59.9);		
		Collection<Double> db = new ArrayList<>();
		db.add((double)67);		
		
		System.out.println(marks.equals(db));
		System.out.println(marks.equals(temp));
		System.out.println(marks.equals(flt));
		System.out.println(marks.hashCode());
		System.out.println(temp.hashCode());
		System.out.println(flt.hashCode());
		System.out.println(marks1.isEmpty());
	}
}