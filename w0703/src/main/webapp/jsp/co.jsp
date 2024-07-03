<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String chk = null;
	String cookId = "";
	Cookie[] cookies = request.getCookies(); //쿠키를 싹 다 들고온다
	if(cookies != null){
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("remember")){
				chk = "checked";
				cookId = cookie.getValue();
				System.out.println("cookid: "+cookId);
			}
		}
	}
    
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키1</title>
	</head>
	<body>
	<!-- 쿠키 -->
	<!-- co.jsp
		doco.jsp
		
		이름,국어,영어,수학, 체크:이름저장 > 이름,국어,영어,수학,합계,평균 입력창이동
		
		이름은 자동입력
	
	 -->
	 <h2>성적입력</h2>
	 <form action="doco.jsp" method="post">
	 <label>이름</label>
	 <input type="text" name="name" value=<%=cookId %>><br>
	 <input type="checkbox" name="remember"
	 id="remember" value="remember" <%=chk %>><br>
	 <label>국어</label>
	 <input type="number" name="kor"><br>
	 <label>영어</label>
	 <input type="number" name="eng"><br>
	 <label>수학</label>
	 <input type="number" name="math"><br>
	 <input type="submit" value="입력">
	 </form>
	</body>
</html>