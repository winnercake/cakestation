<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	<h1>회원탈퇴</h1>
	<form action="/member/dropCustomer" method="post">
		<fieldset>
			<ul>
				<li>비밀번호 : <input type="password" value="비밀번호를 입력해주세요" name="userPwd"></li>
				<input type="submit" value="회원탈퇴">
				<input type="button" value="취소">
			</ul>
		</fieldset>
	</form>
</body>
</html>