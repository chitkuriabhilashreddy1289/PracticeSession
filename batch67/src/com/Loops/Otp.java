package com.Loops;
import java.util.Random;

public class Otp {

	public static void main(String[] args) {
          Random random=new Random();
         // Otp o=new Otp();
          String otp="";
          for(int i=1;i<=4;i++) {
        	  int digit=random.nextInt(50);
        	  otp+=digit;
          }
          System.out.println(otp);
	}

}
