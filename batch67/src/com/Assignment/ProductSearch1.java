package com.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductSearch1 {

	public static void main(String[] args) {
		// Step 1: Product list
        List<String> products = new ArrayList<>();
        products.add("iPhone 14");
        products.add("Samsung Galaxy S23");
        products.add("Redmi Note 12");
        products.add("OnePlus Nord");
        products.add("Apple AirPods");
        products.add("Mobile Charger");
        products.add("Bluetooth Headphones");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a key to search");
        String key=sc.next();
        
        Iterator<String> itr=products.iterator();
        boolean found=false;
        while(itr.hasNext()) {
        	String product=itr.next();
        	if(product.toLowerCase().contains(key.toLowerCase())) {
        		System.out.println(product);
        		found=true;
        	}
        }
        if(!found) {
        	System.out.println("product not found");
        }
	}

}
