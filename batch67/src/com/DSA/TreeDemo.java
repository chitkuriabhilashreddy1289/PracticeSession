package com.DSA;

public class TreeDemo {

	   public static void main(String[] args) {

	        Node root = new Node(10);
	        root.left = new Node(5);
	        root.right = new Node(15);

	        System.out.println("Root: " + root.data);
	        System.out.println("Left: " + root.left.data);
	        System.out.println("Right: " + root.right.data);

	    }


}

