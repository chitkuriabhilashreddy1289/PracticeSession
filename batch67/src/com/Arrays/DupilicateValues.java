package com.Arrays;

public class DupilicateValues {

	public static void main(String[] args) {
       int arr[]= {1,3,1,2,5,2,7};
       boolean b[]=new  boolean[arr.length];

        for(int i=0;i<arr.length;i++) {

        	if(b[i]) {
        		continue;
        	}

        	int count=1;
        	for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					b[j]=true;
				}
			}
        	System.out.println(arr[i]+" count : "+count);

        }
	}

}
