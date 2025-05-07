<%@page import="com.sohamglobal.services.AccountInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body style="margin-top:35px">
<div class="container">
<h1 class="display-5">Account Information</h1>
<hr>
<%
int no=Integer.parseInt(request.getParameter("accountNumber"));
AccountInfo obj=new AccountInfo();
obj.setNumber(no);
String nm=obj.getName();
float bal=obj.getBalance();
%>

Name : <%=nm%>
<br>
Balance : <%=bal%>


</div>
</body>
</html>