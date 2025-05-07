<%@page import="com.sohamglobal.services.DiscountFinder"%>
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
<h1 class="display-4">Calculating Discount...</h1>
<hr>

<%
float amount=Float.parseFloat(request.getParameter("amount"));
float discount=0;

DiscountFinder obj=new DiscountFinder();
obj.setAmount(amount);
discount=obj.getDiscount();
%>

<span style="color:purple;font-weight:bold">
Amount : <%=amount %>
<br>
Discount : <%=discount %>
</span>


</div>

</body>
</html>