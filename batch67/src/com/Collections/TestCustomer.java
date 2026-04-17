package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c = new Customer(1, "ishan", 24);
		Customer c1 = new Customer(2, "Abhishek", 25);
		Customer c2 = new Customer(3, "Sky", 28);
		Customer c3 = new Customer(4, "Tilak", 26);
		Customer c4 = new Customer(5, "Akshar", 29);
		List<Customer> list = new ArrayList<>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		Comparator<Customer> cs = new Comparator<>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				if (o1.cage < o2.cage) {
					return -1;
				} else if (o1.cage < o2.cage) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(list,cs);

		for (Customer t : list) {
			System.out.println(t);
		}

	}

}
