package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[]arr = { 1, 4, 6, 3, 9, 6, 4, 5};
		Set<Integer> s = new HashSet<>();
		  for(int n:arr) {
			  if(!s.add(n)) {
				  System.out.println(n);
			  }
		  }
	}
}
