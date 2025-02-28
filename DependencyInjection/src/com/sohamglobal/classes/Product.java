package com.sohamglobal.classes;

public class Product {
	
	private String productName;
	private String brand;
	private double price;
	
	public Product(String productName, String brand, double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}
	
	public void showProduct()
	{
		System.out.println("PRODUCT INFORMATION");
		System.out.println("---------------------------------");
		System.out.println("Product Name : "+productName);
		System.out.println("Brand        : "+brand);
		System.out.println("Price        : "+price);
	}
	

}
