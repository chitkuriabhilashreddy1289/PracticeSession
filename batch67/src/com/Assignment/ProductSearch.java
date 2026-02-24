package com.Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSearch {

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

        // Step 2: User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine();

        // Step 3: Search logic
        System.out.println("\nSearch Results:");
        boolean found = false;

        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found");
        }

        sc.close();
    }
}