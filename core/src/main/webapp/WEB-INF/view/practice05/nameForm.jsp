<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
	기본
	<hr width="80%">

	<br>
	<form action="/requestParam/basic/bizName" method="get">
		이름 : <input type="text" name="name"><br>
		<input type="submit" value="조회" >
	</form>
</body>
</html>