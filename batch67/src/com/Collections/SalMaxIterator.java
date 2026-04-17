package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class SalMaxIterator {

	public static void main(String[] args) {
		Collection<Integer> salary = new ArrayList<>();
		salary.add(5600);
		salary.add(4000);
		salary.add(6000);
		salary.add(7000);
		salary.add(3000);
		salary.add(2000);
		salary.add(23000);

		int max = 0;
		for (Integer temp : salary) {
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println(max);
	}

}
