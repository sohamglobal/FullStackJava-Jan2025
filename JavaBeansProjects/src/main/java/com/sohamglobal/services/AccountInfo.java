package com.sohamglobal.services;

import java.sql.*;

public class AccountInfo {
	private int number;
	private String name;
	private float balance;
	
	public AccountInfo()
	{
		number=0;
		name="";
		balance=0;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public void setNumber(int number) {
		this.number = number;
		retrieveData();
	}
	
	private void retrieveData()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("select accnm,balance from accounts where accno=?");
			pst.setInt(1, number);
			rs=pst.executeQuery();
			if(rs.next())
			{
				name=rs.getString("accnm");
				balance=rs.getFloat("balance");
			}
			else
			{
				name="Not found";
				balance=0;
			}
			con.close();
		}
		catch(Exception e)
		{
			name="Error in calling the service";
			System.out.println(e);
		}
	}
	
	

}
