<%@page import="java.util.List"%>
<%@page import="user.model.vo.CustomerMember" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<CustomerMember> list = (ArrayList<CustomerMember>)request.getAttribute("cList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원 관리</title>
</head>
<body>
	<h1>일반회원</h1>
	<table border="1">
		<tr>
			<th>회원 아이디</th>
			<th>회원 이름</th>
			<th>기타</th>
		</tr>
		<% for(CustomerMember cOne : list) { %>
		<tr>
			<td><%= cOne.getMemberId() %></td>
			<td><%= cOne.getMemberName() %></td>
			<td><a href="#">[정보수정]</a> / <a href="#">[회원탈퇴]</a></td>
		</tr>
		<% } %>
	</table>
</body>
</html>