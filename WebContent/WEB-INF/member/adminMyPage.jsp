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
<title>관리자 마이페이지</title>
</head>
<body>
	<h1>관리자 마이페이지</h1>
	<a href="/member/adminMyPage">가입승인</a><br>
	<a href="/member/customerList">일반회원</a><br>
	<a href="/member/shopList">업체회원</a><br>
	<a href="/member/dropMember">탈퇴승인</a><br><br>
	
	<h1>가입승인</h1>
	<table border="1">
		<tr>
			<th>회원 아이디</th>
			<th>업체명</th>
			<th>승인</th>
			<th>거부</th>
		</tr>
		<% for(ShopMember sOne : list) { %>
		<tr>
			<td><%= sOne.getShopId() %></td>
			<td><%= sOne.getShopName() %></td>
			<td><a href="/member/approvalMember">[승인]</a></td>
			<td><a href="#">[거부]</a></td>
		</tr>
		<% } %>
	</table>
</body>
</html>