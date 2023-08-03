<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<style>
#header {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
<h2>회원 가입</h2>
<hr width="80%">
<form action="/insert/insertMemberByHashMap" method="post">
		아이디 : <input type="text" name="id"  required class="w200"><br>
		패스워드 : <input type="password" name="password" required class="w200"><br>
		이름 : <input type="text" name="name"  required class="w200"><br>
		나이 : <input type="text" name="age"  required class="w200"><br>
		성별 : <input type="checkbox" name="sex" value="F" >여자
			  <input type="checkbox" name="sex" value="M" >남자<br>
	<input type="submit" value="가입" class="w200">
	<input type="reset" value="취소" class="w200">
</form>
</body>
</html>