package com.fi.programs;

import com.fi.interfaces.Shopping;

public class LambdaExpression {
	public static void main(String[] args) {
		
		Shopping obj=(double amount)->{
			double discount=amount*10/100;
			return discount;
		};
		
		System.out.println(obj.calcDiscount(13000));
	}

}
