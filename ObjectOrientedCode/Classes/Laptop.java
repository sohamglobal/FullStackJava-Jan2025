package com.sharayu.classes;

public abstract class Laptop {
	
	public abstract void showSpecs();
	
	public final void calcDiscount(double amount)
	{
		double discount=amount*9/100;
		System.out.println("Discount will be "+discount);
	}

}
