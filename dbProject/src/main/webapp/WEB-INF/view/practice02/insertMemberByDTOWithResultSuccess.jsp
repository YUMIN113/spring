<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>success</title>
<style>
#header {
	text-decoration: none;
	color: black;
}

table {
	margin-left: auto;
	margin-right: auto;
    width: 60%;
    border: 1px solid black;
    border-collapse: collapse;
}

tr, td {
   border: 1px solid black;
}

#attribute {
	background-color : lightgrey;
}
</style>
</head>
<body>
<h2>회원 가입</h2>
	<hr width="80%">
	<br><br>
	<h2>!!! 회원 가입에 성공하셨습니다. !!! ${resultCnt}</h2>
	<h2></h2>
	<table>
		<tr id="attribute">
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>나이</td>
			<td>성별</td>
			<td>성별(명)</td>
		</tr>
		<tr>
			<td>${member.id}</td>
			<td>${member.password}</td>
			<td>${member.name}</td>
			<td>${member.age}</td>
			<td>${member.sex}</td>
			<td>${member.sexName}</td>
		</tr>
	</table>
</body>
</html>