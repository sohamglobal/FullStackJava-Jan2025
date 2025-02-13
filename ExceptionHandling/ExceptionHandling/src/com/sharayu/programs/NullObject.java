package com.sharayu.programs;

public class NullObject {
	public static void main(String[] args) {
		String nm=null;
		//String nm="spider projects one";
		try
		{
		System.out.println("Length is "+nm.length());
		System.out.println(nm.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("object is null..cant run any function");
		}
	}

}
