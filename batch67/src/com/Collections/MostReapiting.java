package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class MostReapiting {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(5);
		num.add(6);
		num.add(2);
		num.add(8);
		num.add(1);
		num.add(7);
		num.add(9);
		num.add(1);
		num.add(2);
		int max = 0;
		int temp = 0;
		for (int i = 0; i < num.size(); i++) {
			int count = 0;
			for (int j = i; j < num.size(); j++) {
				if (num.get(i) == num.get(j)) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				temp = num.get(i);
			}

		}
		System.out.println(temp);
	}

}
