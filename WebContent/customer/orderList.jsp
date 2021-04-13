<%@page import="order.model.vo.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Order> list = (ArrayList<Order>)request.getAttribute("oList");
	String userId = (String)session.getAttribute("userId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<a href="/member/customerMyPage">회원정보 수정</a><br>
	<a href="/member/dropCustomer">회원탈퇴</a><br>
	<a href="/member/orderList">주문내역 관리</a><br><br>
	
	<h1>주문내역 관리</h1>
	<ul>
		
	</ul>
</body>
</html>