package com.Arrays;

public class VowelCount {

	public static void main(String[] args) {
		String name="hello world";
		char []arr= {'h','e','l','l','o','w','o','r','l','d'};
		char[]vow= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<vow.length;j++) {
				if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
					count++;
				}
				
			}
			System.out.println(arr[i]+":"+count);
		}

	}

}
