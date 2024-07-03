<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
			<meta charset="UTF-8">
			<title>미성년자 확인페이지</title>
	</head>
	<body>
	<%
	String name = URLEncoder.encode(request.getParameter("name"),"utf-8"); 
	//name = URLEncoder.encode(name,"utf-8");//한글인코딩
	int age = Integer.parseInt(request.getParameter("age"));
			//response.sendRedirect: 페이지 분기
	if(age>=18){
		response.sendRedirect("pass.jsp?name="+name+"&age="+age);
	}else
		response.sendRedirect("nopass.jsp?name="+name+"&age="+age);
	
	%>
	</body>
</html>