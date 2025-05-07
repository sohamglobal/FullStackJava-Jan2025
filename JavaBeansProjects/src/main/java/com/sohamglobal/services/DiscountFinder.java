package com.sohamglobal.services;

public class DiscountFinder {
	private float amount;
	private float discount;
	
	public DiscountFinder()
	{
		amount=0;
		discount=0;
	}

	public float getDiscount() {
		return discount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
		
		if(amount>20000)
			discount=amount*13/100;
		else
			discount=amount*9/100;
	}
	
	
	

}
