package com.fi.programs;

import java.util.function.Function;

public class ExampleFunction {
	public static void main(String[] args) {
		Function<Double, Double> obj=(Double amount)->{
			double discount=amount*10/100;
			return discount;
		};
		
		System.out.println(obj.apply(12500.00));
	}

}
