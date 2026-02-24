package com.ExceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student{
	String username="Vinay";
	String password="Abhi@1289";
	int cvv=123;
	long cardno=767587899;
}

public class Serialization {

	public static void main(String[] args) throws IOException {
		System.out.println("main started");
         FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\Abhilash reddy\\\\OneDrive\\\\Attachments\\\\abhi3.txt");
         ObjectOutputStream os=new  ObjectOutputStream(fo) ;
         os.writeObject(os);
	}

}
