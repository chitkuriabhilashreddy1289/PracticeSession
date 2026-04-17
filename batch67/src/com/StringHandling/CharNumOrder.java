package com.StringHandling;

public class CharNumOrder {

	public static void main(String[] args) {
         String str="V1001lcub5869e J81ava";
         String str1="";
         int sum=0;
         String result="";
         for(int i=0;i<str.length();i++) {
               char c=str.charAt(i);
               if(Character.isDigit(c)) {
            	   str1+=c;
               }else {
            	   if(!str1.equals("")) {
            		   sum+=Integer.parseInt(str1);
            		   str1="";
            	   }
            	   if(Character.isLetter(c)) {
            		   result+=c;
            	   }
               }

         }
         if(!str1.equals("")) {
  		   sum+=Integer.parseInt(str1);

  	   }
         System.out.println("sum:"+sum);
         System.out.println("String :"+result);
         }

}


