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
<body style="margin-top:30px">
<div class="container">
<h1 class="display-4">Accounts Report</h1>
<a href="index.html">Home</a>
<hr>

<table class="table table-bordered table-hover">
<tr>
<th>Number
<th>Name
<th>Type
<th>Balance
</tr>

<%
Connection con;
Statement st;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
	st=con.createStatement();
	rs=st.executeQuery("select * from accounts");
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getInt("accno") %>
		<td><%=rs.getString("accnm") %>
		<td><%=rs.getString("acctype") %>
		<td><%=rs.getFloat("balance") %>
		</tr>
		<%
	}
	con.close();
}
catch(Exception e)
{
	out.println(e);
}


%>




</table>


</div>

</body>
</html>