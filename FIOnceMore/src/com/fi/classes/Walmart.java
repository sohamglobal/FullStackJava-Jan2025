package com.fi.classes;

import com.fi.interfaces.Shopping;

public class Walmart implements Shopping {

	@Override
	public double calcDiscount(double amount) {
		// TODO Auto-generated method stub
		double discount=amount*9/100;
		return discount;
	}

}
