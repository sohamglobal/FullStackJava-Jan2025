package com.praffull.programs;

import com.sharayu.classes.Employee;
import java.io.*;

public class StoreObject {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee e=new Employee();
		e.setEmpno(3456);
		e.setEmpnm("Mohammed Salah");
		e.setDept("sales");
		e.setPost("manager");
		e.setLocation("cairo");
		e.setSalary(72100);
		
		ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("worker1"));
		objout.writeObject(e);
		
		System.out.println("Object stored for future use...");
		objout.close();
	}

}
