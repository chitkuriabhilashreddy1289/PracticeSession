package com.FileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
      FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Abhilash reddy\\\\FileIo1\\\\abhi.ser");
      ObjectInputStream ois=new ObjectInputStream(fis);
      Student s=(Student)ois.readObject();

      System.out.println(s.id);
      System.out.println(s.name);
      System.out.println(s.password);
	}

}
