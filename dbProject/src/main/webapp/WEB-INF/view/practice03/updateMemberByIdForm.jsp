<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<style>
#header {
	text-decoration: none;
	color: black;
}

table {
   margin-left: auto;
   margin-right: auto;	
   width: 40%;
   border: 1px solid black;
   border-collapse: collapse;
 }
 
 tr, td {
   border: 1px solid black;
 }
 
 .button {
 	background-color: lightblue;
 	border-color: lightblue;
 }
</style>
</head>
<body>
<h2>회원 수정</h2>
<hr width="80%">
<form action="/update/updateMember" method="post">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id"  value="${member.id}" required class="w200"></td>
	</tr>
	<tr>
		<td>패스워드</td>
		<td><input type="text" name="password" value="${member.password}" required class="w200"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name"  value="${member.name}" required class="w200"></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="text" name="age"  value="${member.age}" required class="w200"></td>
	</tr>
	<tr>
         <td>성별</td>
         <td>
             <input type="radio" name="sex" value="M" <c:if test="${member.sex eq 'M'.charAt(0)}">checked=checked</c:if>  class="w200">남자 
             <input type="radio" name="sex" value="F" <c:if test="${member.sex eq 'F'.charAt(0)}">checked=checked</c:if>  class="w200">여자
         </td>
     </tr>
</table><br>
	<input type="submit" value="변경" class="button">
	<input type="reset" value="취소" class="button">
</form>
</body>
</html>