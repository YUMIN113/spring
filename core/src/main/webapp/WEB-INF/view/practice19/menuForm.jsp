<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul type="disc">
		<li>Redirect : O</li>
	</ul>
	<form action="/move/redirect/bizMenuRedirect" method="post">
		<select name="menu">
			<option value="americano">아메리카노</option>
			<option value="latte">라떼</option>
			<option value="cappuccino">카푸치노</option>
		</select>
		<input type="submit" value="주문">
	</form>
</body>
</html>