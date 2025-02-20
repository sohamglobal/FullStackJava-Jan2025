package com.sharayu.classes;

public class Three extends One {
	public void showDiscount(double amount)
	{
		double discount;
		discount=amount*9/100;
		System.out.println("Amount : "+amount+"\nDiscount : "+discount);
	}

}
