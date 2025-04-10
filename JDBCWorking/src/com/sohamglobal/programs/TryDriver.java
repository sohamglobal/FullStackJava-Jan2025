package com.sohamglobal.programs;

public class TryDriver {
	public static void main(String[] args) {
		System.out.println("First JDBC program running...");
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully!!!");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
