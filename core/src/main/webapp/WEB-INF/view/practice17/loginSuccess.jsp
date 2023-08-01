<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2><a href="/mainHome" id="header">index</a> | <a href="/loginForm" id="header">{로그인}</a></h2>
	<hr width="80%">
	<br><br>
	<h2>!!! 로그인에 성공하셨습니다. !!!</h2>
	<br>
	아이디 : ${loginUser.getId()}<br>
	비밀번호 : ${loginUser.getPassword()}
</body>
</html>