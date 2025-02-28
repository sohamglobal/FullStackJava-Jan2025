package com.sohamglobal.classes;

public class Customer {
	
	private String custName;
	private String city;
	private Product product;
	
	public Customer(String custName, String city, Product product) {
		super();
		this.custName = custName;
		this.city = city;
		this.product = product;
	}
	
	public void showCustomerDetails()
	{
		System.out.println("CUSTOMER DETAILS");
		System.out.println("-------------------------");
		System.out.println("Customer Name : "+custName);
		System.out.println("City : "+city);
		product.showProduct();
	}
	
	

}
