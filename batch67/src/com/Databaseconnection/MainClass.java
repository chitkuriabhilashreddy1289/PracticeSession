package com.Databaseconnection;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main started");
		JDBCExample1 jdbc=new JDBCExample1();
		jdbc.insert();
		jdbc.select();
	}
	}


