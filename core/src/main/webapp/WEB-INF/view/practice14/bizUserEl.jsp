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
<h2>EL</h2>
<hr width="60%">
<ul>
	<li>String</li>
</ul>
<ul type="circle">
	<li>hello : ${hello}</li>
</ul>
<ul>
	<li>User</li>
</ul>
<ul type="circle">
	<li>
	아이디 : ${user.id}<br>
	비밀번호 : ${user.password}<br>
	이름 : ${user.name}
	</li>
</ul>
</body>
</html>