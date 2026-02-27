package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class AddingLists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(56);
		list.add(67);
		list.add(75);
		list1.add(89);
		list1.add(55);
		list1.add(75);

		List<Integer> list2 = new ArrayList<>(list);
//		for (Integer l : list) {
//			if (!list2.contains(l)) {
//				list2.add(l);
//			}
//		}
//		for (Integer l1 : list1) {
//			if (!list2.contains(l1)) {
//				list2.add(l1);
//			}
//		}
//		System.out.println(list2);
		
		
//		for (Integer l : list1) {
//			if (!list2.contains(l)) {
//				list2.add(l);
//			}
//		}
//		System.out.println(list2);
		
	

	}
}
