<%@page import="shop.model.vo.ShopMember"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<ShopMember> list = (ArrayList<ShopMember>)request.getAttribute("sList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업체회원 관리</title>
</head>
<body>
	<h1>업체회원</h1>
	<table border="1">
		<tr>
			<th>회원 아이디</th>
			<th>업체명</th>
			<th>기타</th>
		</tr>
		<% for(ShopMember sOne : list) { %>
		<tr>
			<td><%= sOne.getShopId() %></td>
			<td><%= sOne.getShopName() %></td>
			<td><a href="#">[정보수정]</a> / <a href="#">[회원탈퇴]</a></td>
		</tr>
		<% } %>
	</table>
</body>
</html>