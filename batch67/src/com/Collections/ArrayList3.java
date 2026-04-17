package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {

		Collection<String> juniors = new ArrayList();
		juniors.add("hardik");
		juniors.add("Ishan");
		juniors.add("dube");
		juniors.add("abhishek");
		juniors.add("sky");
		/*
		 * for(String name:names) {
		 *
		 * System.out.println(name);}
		 */

		Iterator itr = juniors.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());

			if (itr.next().equals("Ishan")) {
				itr.remove();
			}
		}
		System.out.println(juniors);

	}
}
