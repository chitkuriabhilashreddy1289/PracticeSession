package com.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class TestDemoEx5 {

	public static void main(String[] args) throws IOException{
          File f=new File("C:\\Users\\Abhilash reddy\\Documents\\abhi.txt");
            
             //System.out.println( f.delete());
            f.createNewFile();
             System.out.println(  f.canRead());
	}

}
