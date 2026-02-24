package com.Unaryoperators;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x=1;
		int result = x++ - ++x + x-- - --x + x++ - x + --x + x-- - ++x;
           System.out.println(result + " " +x);
           
           int a = 1;
           int result2 = a++ - ++a - a++ +  --a + a-- - a + ++a - a-- ;
           System.out.println(result2+ "  " +a);
	}

}
