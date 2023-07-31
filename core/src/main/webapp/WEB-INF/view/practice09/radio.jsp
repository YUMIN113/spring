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
<h2>input :: radio</h2>
<hr width="60%">
<h3>찬성하십니까?</h3>
<form action="/input/radio" method="get">
	<input type="radio" name="agree" value="1">찬성
	<input type="radio" name="agree" value="2">반대
	<br><br>
	<input type="submit" value="전송" >
</form>
</body>
</html>