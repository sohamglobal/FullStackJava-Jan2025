package com.soham.programs;

import com.sharayu.classes.Barclays;

public class InterfaceDemo {
	public static void main(String[] args) {
		Barclays obj=new Barclays();
		String msg=obj.calcInterest(300000);
		System.out.println(msg);
	}

}
