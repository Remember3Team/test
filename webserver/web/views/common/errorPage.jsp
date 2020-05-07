<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//src/LoginServlet에서 보내준 에러에 대한 객체를 받아보자
	//jsp에서 request 객체를 반환할 경우 Object 객체로 반환된다. 

	String message = (String)(request.getAttribute("msg"));
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		height:150px;
		width:150px;
		background:yellow;	
	}
</style>
</head>
<body>
	<!-- 에러페이지 입니다. -->
	<h1 align="center">
		<%=message %>
	</h1>
	<div onclick="goHome()"></div>
	
	<script>
		function goHome(){
			//일종의 뒤로가기 버튼
			location.href="index.jsp";
			//내가 원하는 경로로 넘어가겠다. (상대경로 시 web폴더부터 찾음)
		}
	</script>
</body>
</html>