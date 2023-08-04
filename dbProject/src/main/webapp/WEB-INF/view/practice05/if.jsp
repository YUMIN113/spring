<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<script>
	document.getElementById('search').addEventListener('submit', (e) => {
		e.preventDefault();
		
		let searchResultHTML = 
			'<table>
			<tr id="attribute">
				<td>구분</td>
				<td>아이디</td>
				<td>이름</td>
				<td>나이</td>
				<td>성별</td>
				<td>주소</td>
				<td>등록일</td>
			</tr>
			<c:forEach items="${customerDTOList}" var="customerDTO" varStatus="status">
				<tr>
					<td>${customerDTO.gb}</td>
					<td>${customerDTO.id}</td>
					<td>${customerDTO.name}</td>
					<td>${customerDTO.age}</td>
					<td>${customerDTO.sex}</td>
					<td>${customerDTO.address}</td>
					<td>${customerDTO.regdate}</td>
				</tr>
			</c:forEach>
			</table>'; 
			document.getElementById('searchResult').innerHTML = searchResultHTML;
	})
</script>
	<form action="/dynamic/if/selectCustomerList" method="post">
		<fieldset>
			<legend>&nbsp;검색 조건&nbsp;</legend>
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" id="id" ></td>
					<th>주소</th>
					<td><select name="address" id="address" >
							<option value="">-- 주소 --</option>
							<option value="seoul" >서울</option>
							<option value="barcelona" >바르셀로나</option>
							<option value="london" >런던</option>
							<option value="paris" >파리</option>
							<option value="newyork" >뉴욕</option>
					</select></td>
					<td rowspan="2">
						<input type="submit" value="검색" id="search" ><br>
						<input type="reset" id="init" value="취소" ></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" id="name" ></td>
					<th>성별</th>
					<td>
						<input type="radio" name="sex" id="sex0" value="" checked>전체
						<input type="radio" 	name="sex" id="sex1" value="M" >남자 
						<input type="radio" name="sex"  id="sex2" value="F" >여자
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
<div id="searchResult">
</div>
</body>
</html>