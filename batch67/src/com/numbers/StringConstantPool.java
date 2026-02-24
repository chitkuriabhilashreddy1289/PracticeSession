package com.numbers;

public class StringConstantPool {

	public static void main(String[] args) {
		//SPC
       String name= "vcube";
       String name1="vcube";
       String name3=new String("vcube");
       //String
       String s="Hello";
       s=s+"vinay";//slow 
       
       // String builder
       StringBuilder sb=new StringBuilder("Hello");
       sb.append("Vinay");
       //Fast
       //String buffer
       StringBuffer sf=new StringBuffer("Hello");
       sf.append("Vinay");//to modify text in multi-thread programs  
       //intern()-forces a string into string constant pool
       String a=new String("vcube");
       String b=a.intern();
       String c="vcube";
       System.out.println(b==c);//true
       System.out.println(a==b);//false
       System.out.println(c==a);//false
       System.out.println(name.equals(name1));//true
       System.out.println(name==name3);//false
System.out.println(name.concat(name3));//vcubecvube
	}

}
