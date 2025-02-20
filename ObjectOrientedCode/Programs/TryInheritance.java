package com.praffull.programs;

import com.sharayu.classes.Three;
import com.sharayu.classes.Two;

public class TryInheritance {
	public static void main(String[] args) {
		Two obj1=new Two();
		obj1.calcSquare(25);
		obj1.calcSum(55, 77);
				
		Three obj2=new Three();
		obj2.showDiscount(12500.00); //Three
		obj2.calcSum(23,89); //One
		//obj2.calcSquare(49); //Two
		
	}

}
