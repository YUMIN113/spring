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
	<h2>로그인 성공</h2>
	<br>
	아이디 : ${id}<br>
	비밀번호 : ${password}
</body>
</html>