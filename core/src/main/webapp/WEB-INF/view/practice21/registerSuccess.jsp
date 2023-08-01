<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.core.practice21.Member" %>
<%@ page import="java.util.List" %>
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
<%
	Member member = (Member)session.getAttribute("member");
	List<String> favorite = member.getFavorite();
%>
	<h2><a href="/session/index" id="header">index</a> | <a href="/session/loginForm" id="header">로그인</a> | <a href="/session/registerForm" id="header">{회원가입}</a></h2>
	<hr width="80%">
	<br><br>
	<h2>세션 정보</h2>
	<table>
		<tr id="attribute">
			<td>아이디</td>
			<td>비밀번호</td>
			<td>성별</td>
			<td>주소</td>
			<td>좋아하는 것</td>
		</tr>
		<tr>
			<td><%=member.getId()%></td>
			<td><%=member.getPassword()%></td>
			<td><%=member.getSex()%></td>
			<td><%=member.getAddress()%></td>
			<td>
			<%
				if(favorite != null) {
					for(int i = 0; i < favorite.size(); i++) {
			%>
			<%=favorite.get(i)%><br>
			<%
					}
				}
			%>
			</td>
		</tr>
	</table>
</body>
</html>