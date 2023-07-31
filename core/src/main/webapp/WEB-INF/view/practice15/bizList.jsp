<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.core.practice15.User" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>List</title>
</head>
<body>
<h2>List</h2>
<hr width="60%">
1. 리스트 : String
<br>
<br>
<% 
	List<String> stringList = (List<String>)request.getAttribute("stringList");
	for(int i = 0; i < stringList.size(); i++) {
%>
	<%= stringList.get(i) %><br>
<% } %>
<br>
2. 리스트 : User
<br>
<br>
<%
	List<User> userList = (List<User>)request.getAttribute("userList");
	for(int i = 0; i < userList.size(); i++) {
%>
	아이디 : <%=userList.get(i).getId()%><br>
	비밀번호 : <%=userList.get(i).getPassword()%><br>
	이름 : <%=userList.get(i).getName()%><br><br>
<% } %>
</body>
</html>