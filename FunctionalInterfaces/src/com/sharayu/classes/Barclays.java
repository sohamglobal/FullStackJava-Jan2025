package com.sharayu.classes;

import com.praffull.interfaces.Banking;

public class Barclays implements Banking {

	@Override
	public String calcInterest(double balance) {
		// TODO Auto-generated method stub
		double interest;
		interest=balance*7/100;
		return "Interest will be "+interest;
	}

}
