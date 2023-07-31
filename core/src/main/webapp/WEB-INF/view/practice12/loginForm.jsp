<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>login</title>
<style>
#header {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
	<h2><a href="/" id="header">index</a> | <a href="/login/loginForm" id="header">{로그인}</a> | <a href="/register/registerForm" id="header">회원가입</a></h2>
	<hr width="80%">
	<br>
	<form action="/login/loginSuccess" method="post">
		아이디 : <input type="text" name="id" ><br>
		패스워드 : <input type="text" name="password" ><br>
		<input type="submit" value="로그인" >
		<input type="reset" value="취소" >
	</form>
</body>
</html>