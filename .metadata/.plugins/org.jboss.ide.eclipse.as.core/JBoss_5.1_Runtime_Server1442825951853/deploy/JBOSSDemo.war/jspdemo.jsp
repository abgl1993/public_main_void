<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page errorPage="errpage.jsp"%>
<%@page import="java.util.Date" %>
<%@include file="count.jsp" %>
<%@taglib %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=4 %>
<table>
<tr>
<%for(int counter=0;counter<10;counter++){ %>
<td><%=counter%></td>
<%} %>
</tr>
</table>
<%=new Date().toString()%>
</body>
</html>