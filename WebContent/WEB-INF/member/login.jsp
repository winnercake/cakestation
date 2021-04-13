<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = (String)session.getAttribute("userId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script src="${contextPath}/resources/js/js.cookie.js"></script>
<script type="text/javascript">

 	/* 일반/업체 로그인 선택 */
	function chLogBtn(index){
		if(index==1){
			$("#user-login").css('display','');
			$("#shop-login").css('display','none');
		}else if(index=2){
			$("#user-login").css('display','none');
			$("#shop-login").css('display','');
		}else{
			$("#user-login").css('display','');
			$("#shop-login").css('display','none');
		}
	}

	/* 아이디(쿠키) 저장 */
	$("#userId").val(Cookies.get('key'));      
	    if($("#userId").val() != ""){
	        $("#saveId").attr("checked", true);
	    }
	    
	$("#saveId").change(function(){
	    if($("#saveId").is(":checked")){
	        Cookies.set('key', $("#userId").val(), { expires: 7 });
	    }else{
	          Cookies.remove('key');
	    }
	});
	     
	$("#userId").keyup(function(){
	    if($("#saveId").is(":checked")){
	        Cookies.set('key', $("#userId").val(), { expires: 7 });
	    }
	});	
	
</script>
<!-- <script src="http://code.jquery.com/jquery-3.3.1.min.js"></script> -->
<title>로그인</title>
</head>
<body>

	<!-- 헤더 -->
	<header>
		<section class="wrapper">		
			<section id="header-user">
				<a href="/WEB-INF/member/login.jsp">로그인&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
				<a href="/WEB-INF/member/choiceEnroll.html">회원가입&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
				<a href="">고객센터&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
			</section>
			<section id="header-logo">
				<a href="/index.jsp"><img src="/img/cakestation_logo.png" /></a>
			</section>
		</section>
	</header>
	
	<!-- 네비 -->
	<nav>
		<ul>
			<li><a href="">HOME</a></li>
			<li><a href="">매장</a></li>
			<li><a href="">케이크</a></li>
			<li><a href="">내 주변 가게 찾기</a></li>
			<li><a href="">마이페이지</a></li>
		</ul>
	</nav>
	
	<!-- 메인 -->
	<main>
		

		<h1>로그인</h1>
		
		<button onclick="chLogBtn(1)">일반</button>
		<button onclick="chLogBtn(2)">업체</button>
		
		<div id="user-login" class="tabcontent">
			<% if(userId == null) { %>
			<h3>고객 로그인</h3>
			<form action="/member/login" method="post">
				ID : <input type="text" name="userId"><br>
				PW : <input type="password" name="userPwd"><br>
				<input type="submit" value="로그인"><br>
				<input type="checkbox" id="saveId">아이디 저장
				<a href="/member/findId.jsp">아이디 찾기</a>
				<a href="/member/findPwd.jsp">비밀번호 찾기</a>
			</form>
			<% } %>
		</div>
		
		<div id="shop-login" style="display:none;">
			<% if(userId == null) { %>
			<h3>업체 로그인</h3>
			<form action="/shop/login" method="post">
				ID : <input type="text" name="userId"><br>
				PW : <input type="password" name="userPwd"><br>
				<input type="submit" value="로그인"><br>
				<input type="checkbox" name="saveId">아이디 저장
				<a href="/member">아이디 찾기</a>
				<a href="">비밀번호 찾기</a>
			</form>
			<% } %>
		</div>
	
		<!-- 로그인하기 -->
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
		
		<!-- 로그인 완료 -->
		<% if(userId != null && userId != "") { %>
		<%= userId %> 님 환영합니다.
		<a href="/member/logout">로그아웃</a>
		<br>
		
		
		<% } %>


	</main>
	
	<!-- 푸터 -->
	<footer>
		<section class="footer-layer" id="footer-lay1">
			<p class="footer-bold"><b>Cake Station Company</b></p>
			<p>서울특별시 중구 남대문로1가 남대문로 120 (대일빌딩2,3층)</p>
			<p>사업자등록번호 123-12-12345</p>
			<button>사업자정보확인</button>
		</section>
		<section class="footer-layer" id="footer-lay2">
			<a href=""><img src="/img/Instagram_logo.png" width="30"/>
			<p>인스타 문의 : cakestation@iei_kh</p></a>
		</section>
		<section class="footer-layer" id="footer-lay3">
			<a href=""><p class="footer-bold">공지사항&nbsp;&nbsp;</p></a>
			<a href=""><p class="footer-bold">고객센터&nbsp;&nbsp;</p></a>
			<p>영업시간  (월~금)09:00 ~ 18:00&nbsp;&nbsp;&nbsp;&nbsp;점심시간 12:00 ~ 13 : 00</p>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;토,일(공휴일휴무)</p>
		</section>
	</footer>
	
</body>
</html>