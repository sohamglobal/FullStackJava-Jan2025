package com.praffull.programs;

import com.sharayu.classes.Patient;

public class StaticHospital {
	public static void main(String[] args) {
		Patient p1=new Patient();
		p1.setName("James");
		p1.showName();
		
		Patient p2=new Patient();
		//p2.setName("Andrew");
		p2.showName();
		
		Patient p3=new Patient();
		p3.showName();
		p3.setName("Adam");
		
		p1.showName();
		
		Patient.showName();
		
		
	}

}
