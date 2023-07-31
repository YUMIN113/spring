<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.core.practice14.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>String</li>
</ul>
<ul type="circle">
	<li><%=request.getAttribute("hello") %></li>
</ul>
<ul>
	<li>User</li>
</ul>
<ul type="circle">
	<li>
	<% User user = (User)request.getAttribute("user"); %>
	아이디 : <%= user.getId() %><br>
	비밀번호 : <%= user.getPassword() %><br>
	이름 : <%= user.getName() %>
	</li>
</ul>
</body>
</html>