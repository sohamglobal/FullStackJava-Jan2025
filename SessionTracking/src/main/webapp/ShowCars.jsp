<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="margin-top:45px">
<div class="container">
<%
String comp=request.getParameter("brand");
%>


<h1>Model information <%=comp%></h1>
<hr>

<%
Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
	pst=con.prepareStatement("select * from cars where company=?");
	pst.setString(1,comp);
	rs=pst.executeQuery();
	
	while(rs.next())
	{
		out.println("<br>"+rs.getString("modelnm")+" | "+rs.getFloat("price"));
	}
	
	con.close();
}
catch(Exception e)
{
	out.println(e);
}

%>


</div>
</body>
</html>