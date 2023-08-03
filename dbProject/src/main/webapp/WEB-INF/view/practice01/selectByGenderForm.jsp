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
	
	<form action="/select/selectMemberBySex" method="post">
		성별 :
		<select name="sex">
				  <option value="F">여자</option>
				  <option value="M">남자</option>
	    </select><br>
		<input type="submit" value="조회" class="w200">
		<input type="reset" value="취소" class="w200">
	</form>
</body>
</html>