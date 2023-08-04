<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ForEach</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<style>
 table {
    width: 60%;
    border: 1px solid black;
    border-collapse: collapse;
    margin-left: auto;
    margin-right: auto;
  }
  
  tr, td {
    border: 1px solid black;
  }
  
  li {
  	float : left;
  }
  
  #attribute {
  	background-color : lightgrey;
  }
</style>
</head>
<body>
<h2>회원 조회</h2>
<hr width="80%">
<br>
<br>
<table>
	<tr id="attribute">
		<td>번호</td>
		<td>아이디</td>
		<td>패스워드</td>
		<td>이름</td>
		<td>나이</td>
		<td>성별</td>
		<td>성별(명)</td>
		<td>삭제</td>
	</tr>
	<c:forEach items="${memberList}" var="member" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${member.id}</td>
			<td>${member.password}</td>
			<td>${member.name}</td>
			<td>${member.age}</td>
			<td>${member.sex}</td>
			<td>${member.sexName}</td>
			<td><button onclick="location.href='/delete/deleteMember?id=${member.id}'">삭제</button></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>