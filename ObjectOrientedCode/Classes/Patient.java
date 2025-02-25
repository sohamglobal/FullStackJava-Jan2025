package com.sharayu.classes;

public class Patient {
	private static String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public static void showName()
	{
		System.out.println("Patient name is "+name);
	}

}
