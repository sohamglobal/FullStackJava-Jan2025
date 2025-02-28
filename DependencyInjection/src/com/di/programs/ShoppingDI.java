package com.di.programs;

import com.sohamglobal.classes.Customer;
import com.sohamglobal.classes.Product;

public class ShoppingDI {
	public static void main(String[] args) {
		Product product=new Product("latitude 5490 laptop","Dell",79500.00);
		Customer customer=new Customer("Praffull","London",product);
		customer.showCustomerDetails();
	}

}
