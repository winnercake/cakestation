<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
</head>
<body>

	<h3>비밀번호 찾기</h3>
	<hr><br>

	<!-- if 인증번호 값이 없으면(get) 찾기,, 디폴트? -->
	<%-- <% if(userId == null) { %> --%>
	<form action="/member/findPwd" method="post">
	<fieldset>
		<legend>비밀번호 찾기</legend>
		<h5>아이디를 입력해주세요.</h5>
		아이디 : <input type="text" name="userId">
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
	<%-- <% } %> --%>
	
	<!-- if 인증번호 값이 있으면(get) 아이디 표시,, -->
	<%-- <% if(userId != null && userId != "") {%> --%>
	<form action="" method=""> <!-- 인증번호 일치하면(어떻게? 포스팅 보기) 재설정으로 넘어감 -->
	<fieldset>
		<legend>비밀번호 찾기</legend>
		<h5>인증번호를 입력해주세요.</h5>
		<input type="text" name="certification-num"><br>
		<input type="submit" value="확인">
	</fieldset>
	</form>
	<%-- <% } %> --%>
	
</body>
</html>