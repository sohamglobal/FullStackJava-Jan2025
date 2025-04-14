package com.sohamglobal.programs;

import java.util.Scanner;
import java.sql.*;

public class NewEmployeeAuto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter post: ");
        String post = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        
        System.out.print("Enter salary (must be greater than 10000): ");
        float salary = scanner.nextFloat();
        
        
        //------------JDBC
        Connection con;
        PreparedStatement pst;
        
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("insert into employees(name,dept,post,location,salary) values(?,?,?,?,?)");
			pst.setString(1,name);
			pst.setString(2,dept);
			pst.setString(3,post);
			pst.setString(4, location);
			pst.setFloat(5, salary);
			pst.executeUpdate();
			System.out.println("New employee inserted successfully");
			
			con.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
	}

}
