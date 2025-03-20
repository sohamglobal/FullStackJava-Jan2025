package com.soham.programs;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> obj=(Integer num)->{
			int sq=num*num;
			System.out.println("Square is "+sq);
		};
		
		obj.accept(13);
	}

}
