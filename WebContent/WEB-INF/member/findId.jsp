<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String userId = (String)request.getAttribute("userId"); // 아이디 가져옴 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
</head>
<body>

	<h3>아이디 찾기</h3>
	<hr><br>

	<!-- if 아이디값이 없으면(get) 찾기,, 디폴트? -->
	<% if(userId == null) { %>
	<form action="/member/findId" method="post">
	<fieldset>
		<legend>아이디 찾기</legend>
		<h5>회원 가입 시 등록한 이메일을 입력해주세요.</h5>
		이메일 : <input type="text" name="email-id"> @ <input type="text" name="email-domain">
		<select>
			<option>naver.com</option>
			<option>gmail.com</option>
			<option>hanmail.com</option>
			<option>nate.com</option>
		</select><br>
		<input type="submit" value="찾기">
	</fieldset>
	</form>
	<% } %>
	
	<!-- if 아이디값이 있으면(get) 아이디 표시,, -->
	<% if(userId != null && userId != "") {%>
	<fieldset>
		<legend>아이디 찾기</legend>
		<h5>회원님의 아이디는 <span style="color:blue; font-weight:bolder;"><%= userId %></span> 입니다.</h5>
	</fieldset>
	<% } %>
</body>
</html>