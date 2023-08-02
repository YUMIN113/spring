<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Request-Model
	<br>
	<hr width="80%">
	
	<%-- ===== 콘솔 출력 : OOONames() ===== --%>
	<br># Request Parameter Names
	<hr width="40%">
	<%
	Enumeration<String> names = request.getParameterNames();
	while (names.hasMoreElements()) {
		String name = names.nextElement();
		out.print(name + "<br>");
	}
	%>

	<br># Request Attribute Names
	<hr width="40%">
	<%
	names = request.getAttributeNames();
	while (names.hasMoreElements()) {
		String name = names.nextElement();
		out.print(name + "<br>");
	}
	%>

	<br># Session Attribute Names
	<hr width="40%">
	<%
	names = session.getAttributeNames();
	while (names.hasMoreElements()) {
		String name = names.nextElement();
		out.print(name + "<br>");
	}
	%>

	<%-- ===== 화면 출력 : JSP 방식 ===== --%>
	<br># Request
	<hr width="40%">
	<table>
		<tr>
			<th>분류</th>
			<th>메서드</th>
			<th>값</th>
		</tr>
		<tr>
			<td>Request</td>
			<td>Parameter</td>
			<td><%=request.getParameter("id")%>, <%=request.getParameter("pw")%></td>
		</tr>
		<tr>
			<td>Request</td>
			<td>Attribute</td>
			<td><%=request.getAttribute("R_Id")%>, <%=request.getAttribute("R_Pw")%></td>
		</tr>
		<tr>
			<td>Session</td>
			<td>Attribute</td>
			<td><%=session.getAttribute("S_Id")%>, <%=session.getAttribute("S_Pw")%></td>
		</tr>
		<tr>
			<td>Model</td>
			<td>Attribute</td>
			<td><%=request.getAttribute("M_Id")%>, <%=request.getAttribute("M_Pw")%></td>
		</tr>
	</table>


	<%-- ===== 화면 출력 : EL 방식 ===== --%>
	<br>
	<br># EL
	<hr width="40%">
	<table>
		<tr>
			<th>분류</th>
			<th>메서드</th>
			<th>값</th>
		</tr>
		<tr>
			<td>Request</td>
			<td>Parameter</td>
			<td>${id},${pw}</td>
		</tr>
		<tr>
			<td>Request</td>
			<td>Attribute</td>
			<td>${R_Id},${R_Pw}</td>
		</tr>
		<tr>
			<td>Session</td>
			<td>Attribute</td>
			<td>${S_Id},${S_Pw}</td>
		</tr>
		<tr>
			<td>Model</td>
			<td>Attribute</td>
			<td>${M_Id},${M_Pw}</td>
		</tr>
	</table>

</body>
</html>