package com.sharayu.classes;

//Every class we create in Java inherits a class Object by default
public abstract class Praffull {
	public Praffull()
	{
		super();
		System.out.println("Base class...Empty constructor");
	}
	
	public Praffull(String name)
	{
		System.out.println(name+" Base class...parameterized constructor");
	}
}
