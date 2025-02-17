package com.sharayu.classes;

public class Customer {
	
	private String custname;
	private double purchamt;
	
	//empty or no arg constructor
	public Customer()
	{
		custname="";
		purchamt=0.0;
		System.out.println("welcome to Java shopping");
	}
	//parameterized constructor
	public Customer(String custname,double purchamt)
	{
		this.custname=custname;
		this.purchamt=purchamt;
		System.out.println("welcome to paramerized constructor");
	}
	
	
	public void showValues()
	{
		System.out.println("Customer name : "+custname);
		System.out.println("Purchase Amount : "+purchamt);
	}
	
	
	

}
