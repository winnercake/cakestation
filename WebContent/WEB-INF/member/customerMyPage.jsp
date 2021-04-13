<%@ page import="user.model.vo.CustomerMember" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	CustomerMember ctMember = (CustomerMember)request.getAttribute("ctMember"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<a href="/member/customerMyPage">회원정보 수정</a><br>
	<a href="/member/ctdrop">회원탈퇴</a><br>
	<a href="/member/orderList">주문내역 관리</a><br><br>
	
	<h1>회원정보 수정</h1>
	<form action="/member/ctupdate" method="post">
		<fieldset>
			<ul>
				<li>아이디 : <input type="text" value="<%= ctMember.getMemberId() %>" readonly name="user-id"></li>
				<li>비밀번호 : <input type="password" value="<%= ctMember.getMemberPwd() %>" name="user-pwd"></li>
				<li>이름 : <input type="text" value="<%= ctMember.getMemberName() %>" name="user-name"></li>
				<li>이메일 : <input type="text" value="<%= ctMember.getMemberEmail() %>" name="user-email"></li>
				<li>전화번호 : <input type="text" value="<%= ctMember.getMemberPhone() %>" name="user-phone"></li>
				<li>주소 : <input type="text" value="<%= ctMember.getMemberAddress() %>" name="user-address"></li>
				<input type="submit" value="수정">
				<input type="button" value="취소">
			</ul>
		</fieldset>
	</form>
</body>
</html>