<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Request-Model<br>
	<hr width="80%">
	
	<form action="/etc/requestModel/login" method="post">
		아이디 :
		<input type="text" name="id" maxlength="20" required class="w200">
		<br> 
		패스워드 :
		<input type="password" name="pw" maxlength="20" required class="w200">
		<br>
		<input type="submit" value="로그인" class="w200">
		<input type="reset" value="취소" class="w200">
	</form>
</body>
</html>