package com.FileIO;

import java.beans.Transient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	private static final long serialVersionUID = 5774902676152498084L;
	int id=123;
	String name="Abhi";
	transient String password="Abhi@1289";
}

public class FileOutStream {

	public static void main(String[] args) throws IOException {
		System.out.println("main started");
		Student s=new Student();
		File f=new File("C:\\Users\\Abhilash reddy\\FileIo1\\abhi.ser");
      FileOutputStream fos= new FileOutputStream(f);
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(s);
	}

}

