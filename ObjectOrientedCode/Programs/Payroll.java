package com.praffull.programs;

import com.sharayu.classes.Employee;

public class Payroll {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.welcome();
		e.calcNetSalary(25000);
		e.showFitnessStatus();
	}

}
