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
<h2>forEach</h2>
<hr width="80%">
<ul>
	<li>String</li>
</ul>
<br>
<br>
<table>
	<tr id="attribute">
		<td>index</td>
		<td>String</td>
	</tr>
	<c:forEach items="${travelList}" var="list" varStatus="status">
		<tr>
			<td>${status.count-1}</td>
			<td>${list}</td>
		</tr>
	</c:forEach>
</table>
<br>
<ul>
	<li>미션 : Travel</li>
</ul>
<br>
<br>
<table>
	<tr id="attribute">
		<td>index</td>
		<td>String</td>
	</tr>
	<c:forEach items="${travelList}" var="list" varStatus="status">
		<tr>
			<td>${status.count-1}</td>
			<c:choose>
				<c:when test="${list eq 'Barcelona'}">
				<td>바르셀로나</td>
				</c:when>
				<c:when test="${list eq 'Paris'}">
				<td>파리</td>
				</c:when>
				<c:when test="${list eq 'London'}">
				<td>런던</td>
				</c:when>
			</c:choose>
		</tr>
	</c:forEach>
</table>
<br>
<ul>
	<li>User</li>
</ul>
<br>
<br>
<table>
	<tr id="attribute">
		<td>index</td>
		<td>id</td>
		<td>password</td>
		<td>name</td>
	</tr>
	<c:forEach items="${userList}" var="list" varStatus="status">
		<tr>
			<td>${status.count-1}</td>
			<td>${list.getId()}</td>
			<td>${list.getPassword()}</td>
			<td>${list.getName()}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>