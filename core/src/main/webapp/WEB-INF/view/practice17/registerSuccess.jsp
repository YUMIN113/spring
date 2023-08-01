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
	<h2><a href="/mainHome" id="header">index</a> | <a href="/loginForm" id="header">로그인</a> | <a href="/registerForm" id="header">{회원가입}</a></h2>
	<hr width="80%">
	<br><br>
	<h2>!!! 회원 가입에 성공하셨습니다. !!!</h2>
	<table>
		<tr id="attribute">
			<td>아이디</td>
			<td>비밀번호</td>
			<td>성별</td>
			<td>주소</td>
			<td>좋아하는 것</td>
		</tr>
		<tr>
			<td>${member.getId()}</td>
			<td>${member.getPassword()}</td>
			<td>${member.getSex()}</td>
			<td>${member.getAddress()}</td>
			<td>
			<c:forEach items="${member.getFavorite()}" var="list">
			<c:choose>
				<c:when test="${list == null}">
				</c:when>
				<c:otherwise>
					${list}<br>
				</c:otherwise>
			</c:choose>
			</c:forEach>
			</td>
		</tr>
	</table>
</body>
</html>