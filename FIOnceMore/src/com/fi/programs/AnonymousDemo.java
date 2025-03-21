package com.fi.programs;

import com.fi.interfaces.Shopping;

public class AnonymousDemo {
	public static void main(String[] args) {
		Shopping obj=new Shopping() {

			@Override
			public double calcDiscount(double amount) {
				// TODO Auto-generated method stub
				double discount=amount*13/100;
				return discount;
			}
			
		};
		System.out.println(obj.calcDiscount(12000));
	}

}
