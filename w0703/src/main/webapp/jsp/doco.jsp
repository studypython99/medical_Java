<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키2</title>
	<style>
	table, th, td{border: 1px solid black; border-collapse: collapse;
	}
	</style>
</head>
<body>
		<h2>로그인정보</h2>
		<table>
			<tr>
				<th>제목</th>
				<th>내용</th>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=request.getParameter("name")%></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><%=request.getParameter("kor") %></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><%=request.getParameter("eng") %></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%=request.getParameter("math") %></td>
			</tr>
		</table>
		<%
		String remember = request.getParameter("remember");
		//String[] remember = request.getParameterValues("remember");
		if (remember != null){
			Cookie rcookie = new Cookie("remember", request.getParameter("id"));
			rcookie.setMaxAge(60*60*24*30); //1달
			response.addCookie(rcookie);
		}
		
		%>
		<a href="co.jsp">로그인페이지 이동</a>
</body>
</html>