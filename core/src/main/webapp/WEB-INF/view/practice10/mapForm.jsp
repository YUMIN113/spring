<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/requestParam/map/bizMap" method="post">
		아이디 : <input type="text" name="id"  required class="w200"><br>
		비밀번호 : <input type="password" name="password" required class="w200"><br>
		이름 : <input type="text" name="name" required class="w200"><br>
		나이 : <input type="number" name="age" min="0" required class="w200"><br>
		<input type="submit" value="등록" class="w200">
	</form>

</body>
</html>