package com.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintLine {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main started");
		File f=new File("C:\\Users\\Abhilash reddy\\OneDrive\\abhi5.txt");
		PrintWriter pw=new PrintWriter(f);
		pw.println("good night");
		pw.println(500083);
		pw.println(true);
		pw.println('A');
		pw.println(pw);

	}

}
