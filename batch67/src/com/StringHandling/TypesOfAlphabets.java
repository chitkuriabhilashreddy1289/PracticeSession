package com.StringHandling;

import java.util.Scanner;

public class TypesOfAlphabets {

	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a text");
      String str=sc.nextLine();
      str=str.toLowerCase();
      int vowcount=0;
      int conscount=0;
      for(int i=0;i<str.length();i++) {
    	  char ch=str.charAt(i);
    	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    		 vowcount++;
    	  }else {
    		  conscount++;
    	  }

      }
      System.out.println("vowcount:"+vowcount);
      System.out.println("conscount:"+conscount);
	}

}
