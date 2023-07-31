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
<h2>input :: checkbox</h2>
<hr width="60%">
<h3>가고 싶은 여행지</h3>
<form action="/input/travel/checkbox" method="get"> 
		<input type="checkbox" name="travel" value="1" >스페인
		<input type="checkbox" name="travel" value="2" >터키
		<input type="checkbox" name="travel" value="3" >브라질
		<input type="checkbox" name="travel" value="4" >그리스
		<br><br>
		<input type="submit" value="전송" >
</form>
</body>
</html>