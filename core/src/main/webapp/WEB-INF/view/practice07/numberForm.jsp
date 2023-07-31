<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<form action="/requestParam/conversion/bizNumber" method="get">
		나이 : <input type="number" name="age" min="1"  max="200" required><br>
		<input type="submit" value="전송" >
	</form>
</body>
</html>