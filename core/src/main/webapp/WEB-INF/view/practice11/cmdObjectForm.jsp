<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/cmd/cmdObject" method="post">
		아이디 : <input type="text" name="id"  required ><br>
		비밀번호 : <input type="password" name="password" required><br>
		이름 : <input type="text" name="name" required ><br>
		나이 : <input type="number" name="age" min="0" required ><br>
		<input type="submit" value="등록" >
	</form>

</body>
</html>