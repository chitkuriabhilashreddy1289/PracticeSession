package com.Arrays;

public class VowelCount {

	public static void main(String[] args) {
		String name="hello world";
		char []arr= {'h','e','l','l','o','w','o','r','l','d'};
		char[]vow= {'a','e','i','o','u'};
		int count=0;
		for (char element : arr) {
			for(int j=0;j<vow.length;j++) {
				if(element=='a'||element=='e'||element=='i'||element=='o'||element=='u') {
					count++;
				}

			}
			System.out.println(element+":"+count);
		}

	}

}
