<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>SelectMember</title>
</head>
<body>
<h2>회원 조회</h2>
	<hr width="80%"><br>
아이디 : ${member.id}<br>
패스워드 : ${member.password}<br>
이름 : ${member.name}<br>
나이 : ${member.age}<br>
성별 : ${member.sex}<br>
성별(명) : ${member.sexName}<br>
</body>
</html>