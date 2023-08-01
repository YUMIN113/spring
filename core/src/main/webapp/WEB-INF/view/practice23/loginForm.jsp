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
	<h2>Cookie</h2>
	<hr width="60%">
	<br>
	<form action="/cookie/login/loginSuccess" method="post">
		아이디 : <input type="text" name="id" value="${loginId}" ><br>
		패스워드 : <input type="text" name="password" ><br>
		<input type="checkbox" name="agree" value="true" >아이디 저장<br><br>
		<input type="submit" value="로그인" >
		<input type="reset" value="취소" >
	</form>
</body>
</html>