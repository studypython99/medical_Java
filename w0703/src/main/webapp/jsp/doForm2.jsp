<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");
	String[] hobby = request.getParameterValues("hobby");
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>회원정보</title>
	<style>
	table, th, td{border: 1px solid black; border-collapse: collapse;
	}
	</style>
	</head>
	<body>
		<h2>회원정보</h2>
		<%
			Enumeration enums = request.getParameterNames();
		while(enums.hasMoreElements()){
			String sname = (String)enums.nextElement();
			out.println("변수명: "+sname+"<br>");
		}
		%>
		<table>
			<tr>
				<th>제목</th>
				<th>내용</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%=request.getParameter("id")%></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><%=request.getParameter("pw") %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=request.getParameter("name") %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=request.getParameter("gender") %></td>
			</tr>
			<%for(int i=0;i<4;i++){ %>
			<tr>
				<td>취미</td>
				<td><%=hobby[i] %></td>
			</tr>
			<%} %>
		</table>
	</body>
</html>