package com.soham.programs;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, String> obj=(Integer n)->{
			int sq=n*n;
			return "square is "+sq;
		};
		
		System.out.println(obj.apply(9));
	}

}
