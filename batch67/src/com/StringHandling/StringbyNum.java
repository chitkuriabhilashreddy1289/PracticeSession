package com.StringHandling;

public class StringbyNum {

	public static void main(String[] args) {
         String s="am2 I1 going3 to4 town6 home5";
         String[]str=s.split(" ");
         int n=1;
         String result="";
         for(String s1:str) {
        	 for(String s2:str) {
        		 if(s2.contains(n+"")) {
        			 result+=s2.replace(n+"", " ");
        			 n++;
        		 }
        	 }
         }
         System.out.println(result);


	}

}
