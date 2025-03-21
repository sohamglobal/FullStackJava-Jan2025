package com.fi.programs;

import java.util.function.Supplier;

public class ExampleSupplier {
	public static void main(String[] args) {
		Supplier<String> obj=()->{
			return "hi from supplier interface";
		};
		
		System.out.println(obj.get());
	}

}
