package com.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TestDemo7 {
	public static void main(String[] args) throws IOException {
		System.out.println("main started");
		FileReader fr = new FileReader("C:\\Users\\Abhilash reddy\\OneDrive\\Attachments\\abhilash\\abhi.txt");
		int i = fr.read();
		// System.out.println((char)i);
		while (i != -1) {
			System.out.println((char) i);
			i = fr.read();
		}
		System.out.print("main ended");
	}

}
