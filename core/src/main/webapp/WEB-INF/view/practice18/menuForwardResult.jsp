<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String menu = (String)request.getAttribute("menu");
	String message = (String)request.getAttribute("message");
%>
<%=menu%>
<%=message%>
</body>
</html>