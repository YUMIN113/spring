<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	회원 조회<br>
	<hr width="80%">
	
	<form action="/select/selectMemberAll" method="post">
		전체 조회<br>
		<input type="submit" value="조회" class="w200">
		<input type="reset" value="취소" class="w200">
	</form>
</body>
</html>