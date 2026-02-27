package com.Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {
         NavigableSet<Integer> n=new TreeSet<>(Arrays.asList(1,2,3,4,5,7,6,9));
         System.out.println(n.floor(4));
         System.out.println(n.lower(4));
         System.out.println(n.higher(4));
         System.out.println(n.ceiling(4));
         System.out.println(n.ceiling(10));
         System.out.println(n.ceiling(8));
         System.out.println(n.pollFirst());
         System.out.println(n.first());
         System.out.println(n.last());
         System.out.println(n.pollLast());
         System.out.println(n.headSet(3,true));
         System.out.println(n.tailSet(2));
         System.out.println(n.subSet(3, 7));
         System.out.println(n.subSet(3, false, 7, false));
         System.out.println(n.subSet(3, false, 7, true));
         System.out.println(n.descendingSet());
         System.out.println(n.size());
         Iterator<Integer> itr = n.descendingIterator();
         while (itr.hasNext()) {
             System.out.print(itr.next() + " ");
         }
	}

}
