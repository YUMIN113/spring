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

table {
   margin-left: auto;
   margin-right: auto;	
   width: 60%;
   border: 1px solid black;
   border-collapse: collapse;
 }
 
 tr, td {
   border: 1px solid black;
 }
</style>
</head>
<body>
<h2><a href="/session/index" id="header">index</a> | <a href="/session/loginForm" id="header">로그인</a> | <a href="/session/registerForm" id="header">{회원가입}</a></h2>
<hr width="60%">
<form action="/session/register" method="post">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id"  required class="w200"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="password" required class="w200"></td>
	</tr>
	<tr>
		<td>성별</td>
		<td><input type="checkbox" name="sex" value="여자" >여자
			<input type="checkbox" name="sex" value="남자" >남자</td>
	</tr>
	<tr>
		<td>주소</td>
		<td><select name="address">
				  <option value="서울">서울</option>
				  <option value="부산">부산</option>
				  <option value="제주">제주</option>
		  	</select></td>
	</tr>
	<tr>
		<td>좋아하는 것</td>
		<td><input type="checkbox" name="favorite" value="낮잠" >낮잠
		<input type="checkbox" name="favorite" value="산책" >산책
		<input type="checkbox" name="favorite" value="커피" >커피
		<input type="checkbox" name="favorite" value="냉면" >냉면</td>
	</tr>
</table>	
<br>
	<input type="submit" value="가입" class="w200">	
	<input type="reset" value="취소" class="w200">
</form>
</body>
</html>