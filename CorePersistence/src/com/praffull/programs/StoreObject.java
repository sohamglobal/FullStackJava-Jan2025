package com.praffull.programs;

import com.sharayu.classes.Employee;
import java.io.*;

public class StoreObject {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee e=new Employee();
		e.setEmpno(1234);
		e.setEmpnm("Charles Leclerc");
		e.setDept("marketing");
		e.setPost("executive");
		e.setLocation("mumbai");
		e.setSalary(45700);
		
		ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("worker"));
		objout.writeObject(e);
		
		System.out.println("Object stored for future use...");
		objout.close();
	}

}
