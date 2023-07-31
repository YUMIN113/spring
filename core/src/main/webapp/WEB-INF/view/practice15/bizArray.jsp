<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.core.practice15.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Array</title>
</head>
<body>
<h2>Array</h2>
<hr width="60%">
1. 배열 : String
<br>
<br>
<% 
	String[] stringArray = (String[])request.getAttribute("stringArray");
	for(int i = 0; i < stringArray.length; i++) {
%>
	<%= stringArray[i] %><br>
<% } %>
<br>
2. 배열 : User
<br>
<br>
<%
	User[] userArray = (User[])request.getAttribute("userArray");
	for(int i = 0; i < userArray.length; i++) {
%>
	아이디 : <%=userArray[i].getId()%><br>
	비밀번호 : <%=userArray[i].getPassword()%><br>
	이름 : <%=userArray[i].getName()%><br><br>
<% } %>
</body>
</html>