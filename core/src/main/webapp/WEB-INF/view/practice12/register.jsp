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
<h2><a href="/" id="header">index</a> | <a href="/login/loginForm" id="header">로그인</a> | <a href="/register/registerForm" id="header">{회원가입}</a></h2>
<hr width="60%">
<form action="/register/register" method="post">
		아이디 : <input type="text" name="id"  required class="w200"><br>
		비밀번호 : <input type="password" name="password" required class="w200"><br>
		성별 : <input type="checkbox" name="sex" value="woman" >여자
			  <input type="checkbox" name="sex" value="man" >남자<br>
		주소 : <select name="address">
				  <option value="Seoul">서울</option>
				  <option value="Busan">부산</option>
				  <option value="Jeju">제주</option>
			  </select><br>
		좋아하는 것 
		<input type="checkbox" name="favorite" value="1" >낮잠
		<input type="checkbox" name="favorite" value="2" >산책
		<input type="checkbox" name="favorite" value="3" >커피
		<input type="checkbox" name="favorite" value="4" >냉면
	<input type="submit" value="등록" class="w200">
</form>
</body>
</html>