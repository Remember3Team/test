<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String message=(String)request.getAttribute("msg");
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
		background:orange;
	}
</style>
</head>
<body>
	<h1 align="center">
		<%=message %>
	</h1>
	<div onclick="goHome()"></div>
	
	<script>
		function goHome(){
			location.href="<%=request.getContextPath()%>/index.jsp";
		}
	</script>
</body>
</html>