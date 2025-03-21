package com.fi.programs;

import java.util.function.Consumer;

public class ExampleConsumer {
	public static void main(String[] args) {
		Consumer<Double> obj=(Double amount)->{
			System.out.println("Discount is "+(amount*9/100));
		};
		
		obj.accept(5700.00);
		
	}

}
