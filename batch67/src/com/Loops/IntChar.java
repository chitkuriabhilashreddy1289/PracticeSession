package com.Loops;

public class IntChar {

	public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=1;i<n;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(j);
        	}
        	for(int k=i;k<n;k++) {
        		System.out.print(c);
        	}
        	c++;
        	System.out.println();
        }
        
	}

}
