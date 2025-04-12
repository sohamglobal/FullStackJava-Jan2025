package com.sohamglobal.programs;
import java.sql.*;
import java.util.*;


public class NewCarEntry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id,nm,co;
		float pr;
		System.out.print("Enter CarID : ");
		id=sc.nextLine();
		System.out.print("Enter Model name : ");
		nm=sc.nextLine();
		System.out.print("Enter Company : ");
		co=sc.nextLine();
		System.out.print("Enter Price : ");
		pr=sc.nextFloat();
		
		//--------------- JDBC
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("insert into cars values(?,?,?,?)");
			pst.setString(1, id);
			pst.setString(2, nm);
			pst.setString(3, co);
			pst.setFloat(4, pr);
			//for insert, update and delete queries executeUpdate()
			pst.executeUpdate();
			con.close();
			System.out.println("new car inserted successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
