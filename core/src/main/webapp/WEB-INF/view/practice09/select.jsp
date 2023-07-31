<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h2>select</h2>
<hr width="60%">
<h3>가고 싶은 여행지</h3>
<form action="/input/travel/select" method="get">
<select name="travel">
	<option value="1">스페인</option>
	<option value="2">터키</option>
	<option value="3">브라질</option>
	<option value="4">그리스</option>
</select><br><br>
	<input type="submit" value="전송">
</form>
</body>
</html>