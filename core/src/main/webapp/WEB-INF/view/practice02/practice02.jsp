<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
*Controller 에서 Method 설정
<br>
<form action="/requestMapping/methodGet" method="get">
	<input type="submit" value="GET 방식">
</form>
<form action="/requestMapping/methodPost" method="post">
	<input type="submit" value="POST 방식">
</form>
</body>
</html>