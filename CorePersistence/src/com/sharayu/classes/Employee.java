package com.sharayu.classes;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int empno;
	private String empnm;
	private String dept;
	private String post;
	private String location;
	private float salary;
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void showEmpData()
	{
		System.out.println("Employee Data\n--------------------");
		System.out.println("Number     : "+empno);
		System.out.println("Name       : "+empnm);
		System.out.println("Department : "+dept);
		System.out.println("Post       : "+post);
		System.out.println("Location   : "+location);
		System.out.println("Salary     : "+salary);
	}

}
