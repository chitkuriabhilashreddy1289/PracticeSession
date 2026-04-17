package com.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TestDemoEx6 {

	public static void main(String[] args){
		System.out.println("main started");
		try {
		FileReader fr=new FileReader("C:\\Users\\Abhilash reddy\\OneDrive\\Attachments\\abhilash\\abhi.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fr.read();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print("main ended");
	}

}
