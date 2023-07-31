<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/requestParam/conversion/bizBoolean" method="get"> 
	<%--<form action="<%=contextPath%>/requestParam/conversion/bizBoolean2" method="get">--%>
		개인정보수집 이용동의<br><br>
		<input type="checkbox" name="agree" value="true" >&nbsp;&nbsp;동의합니다.<br><br>
		<input type="submit" value="전송" >
	</form>
</body>
</html>