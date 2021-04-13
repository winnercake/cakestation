<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = (String)session.getAttribute("userId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if(userId == null) { %>
	<h1>로그인 페이지!</h1>
	<form action="/member/login" method="post">
		ID : <input type="text" name="userId"><br>
		PW : <input type="password" name="userPwd"><br>
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
		<a href="/member/choiceEnroll.html">회원가입</a>
	</form>
	<% } %>
	<% if(userId != null && userId != "") { %>
	<%= userId %> 님 환영합니다.
	<a href="/member/logout">로그아웃</a>
	<br>
	
	
	<% } %>
</body>
</html>