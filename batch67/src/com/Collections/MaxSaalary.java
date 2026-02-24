package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class MaxSaalary {

	public static void main(String[] args) {
          Collection <Integer> salary=new ArrayList();
          salary.add(5600);
          salary.add(4000);
          salary.add(6000);
          salary.add(7000);
          salary.add(3000);
          salary.add(2000);
          int max=0;
          for(int s:salary) {
        	  if(s>max) {
        		  max=s;
        	  }
          }
          System.out.println(max); 
          
	}

}
