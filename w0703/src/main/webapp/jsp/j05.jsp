<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>지시자 %@</title>
	</head>
	<body>
		<%
		//프로젝트명: 컨텍스트 패스
		out.println("컨텍스트 패스: "+request.getContextPath()+"<br>");
		//내부적인 섹션,
		out.println("세션정보: "+request.getContextPath()+"<br>");
		// 창주소
		out.println("URL: "+request.getContextPath()+"<br>");
		
		out.println("URI: "+request.getContextPath()+"<br>");
		
		
		out.println("IP: "+request.getRemoteAddr()+"<br>");
		%>
	
	</body>
</html>