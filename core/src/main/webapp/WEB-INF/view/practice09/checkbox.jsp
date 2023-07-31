<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h2>input :: checkbox</h2>
<hr width="60%">
<h3>약관에 동의하십니까?</h3>
	<form action="/input/checkbox" method="get"> 
		<input type="checkbox" name="agree" value="true" >동의<br><br>
		<input type="submit" value="전송" >
	</form>
</body>
</html>