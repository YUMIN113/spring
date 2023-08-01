<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.core.practice21.LoginUser" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>LoginSuccess</title>
<style>
#header {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
<%
	LoginUser loginUser = (LoginUser)session.getAttribute("loginUser");
%>
	<h2><a href="/session/index" id="header">index</a> | <a href="/session/loginForm" id="header">{로그인}</a></h2>
	<hr width="80%">
	<br><br>
	<h2>세션 정보</h2>
	<br>
	아이디 : <%=loginUser.getId()%><br>
	비밀번호 : <%=loginUser.getPassword()%>
</body>
</html>