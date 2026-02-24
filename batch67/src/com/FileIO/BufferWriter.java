package com.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		System.out.println("main started");
		File f = new File("C:\\Users\\Abhilash reddy\\OneDrive\\abhi4.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		b.write("good day");
		b.flush();
		System.out.println("main ended");

	}

}
