<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body style="margin-top:35px">
<div class="container">
<h1 class="display-4">JSP Search Result</h1>
<hr>

<%
int no=Integer.parseInt(request.getParameter("acno"));
out.println("Account number "+no);

Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
	pst=con.prepareStatement("select * from accounts where accno=?");
	pst.setInt(1, no);
	rs=pst.executeQuery();
	
	if(rs.next())
	{
		%>
		
		
		<br>
		Name : <%=rs.getString("accnm")%>
		<br>
		Balance : <b><%=rs.getString("balance")%></b>
		
		
		<%
	}
	else
	{
		out.println("account not found");
	}
	con.close();
		
	
}
catch(Exception e)
{
	out.println(e);
}
%>


<br><br>
<a href="index.html">Home</a>

</div>

</body>
</html>