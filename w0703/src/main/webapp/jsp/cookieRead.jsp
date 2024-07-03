<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie Read</title>
	</head>
	<body>
	<%
	Cookie[] cookies = request.getCookies(); //모든 쿠키를 가져온다
	if(cookies != null){
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("c_id")){
				String id = cookie.getValue();
				out.println("찾는아이디: "+id+"<br>");
				cookie.setMaxAge(0); //삭제
				response.addCookie(cookie);
			}
		
		}
	}
	%>
	<a href="cookieDel.jsp">쿠키삭제확인</a>
	</body>
</html>