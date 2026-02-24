package com.langfundamentals;

import java.util.Scanner;

public class ZoomRentals {
	ZoomRentals left;
	 static int dailyrent;
	 double insurance ;
	static  int days =7 ;
	 int total;
	static Scanner sc = new Scanner(System.in);

	static String companyname() {
	return "zoomrentals";}
	
 int dailyrentals() {
		 dailyrent = 1500;
		 System.out.println(dailyrent);
	        return dailyrent;
	 }
	   static int totalrent(int days,int dailyrent) {
	   
		  return dailyrent*days;
		  
		  }
	   double insurance() {
		   insurance = 500;
		  return insurance;
		  }
			
		  

		void show() {
			System.out.println(dailyrent);
			System.out.println(insurance);
			System.out.println(days);
			System.out.println(total);
			
			
		}
		  
		  
		 
          
	

	public static void main(String[] args) {
		System.out.println("main method started");
        System.out.println("welcome to ZoomRentals , Have a safe drive ");
        ZoomRentals z1 = new ZoomRentals();
        z1.show();
        z1.insurance();
        z1.dailyrentals();
				  int total= totalrent( days, dailyrent);

     System.out.println(total );
        		
        
        }
      
        }
        