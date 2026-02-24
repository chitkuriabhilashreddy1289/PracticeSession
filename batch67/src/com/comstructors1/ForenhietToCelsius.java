package com.comstructors1;

import java.util.Scanner;

public class ForenhietToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("   TEMPARATURE IN FORENHIET: " );
		double forenhiet = sc.nextDouble();
		double celsius = (forenhiet-32)*5/9;
		System.out.println("  TEMPARATURE IN CELSIUS :   " );
		double C=sc.nextDouble(); 
		double F=(C*1.8)+32;
		// converting forenhiet to celcius
		System.out.println("TEMPARATURE IN CELSIUS: "+celsius+" "+"Celsius");
		System.out.println("TEMPARATURE IN FORENHIET: "+F+" "+"Forenhiet");
		sc.close();

		
		
		

	}

}
