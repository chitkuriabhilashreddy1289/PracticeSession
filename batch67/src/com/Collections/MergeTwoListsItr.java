package com.Collections;

import java.util.Arrays;
import java.util.List;

public class MergeTwoListsItr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,3);
		List<Integer> list1 = Arrays.asList(3,4,5);
		List<Integer> result = Arrays.asList();

		for (Integer temp : list) {
				if(!result.contains(temp)) {
					result.add(temp);
				}
			}
		System.out.println(result);
	}

}
