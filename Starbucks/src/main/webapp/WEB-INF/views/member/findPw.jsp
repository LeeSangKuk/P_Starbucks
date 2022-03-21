<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/member.css">
<link rel="stylesheet" href="../resources/css/login.css">
</head>
<body>
<%@ include file="../includes/header.jsp" %>
<div id="container">
    <div id="container_in">
        <form action="../member/findPw2" method="post">
            <fieldset>
                <legend class="hid">비밀번호 찾기 폼</legend>
                <h1>비밀번호 찾기</h1>
                <section>
                     <p class="member_info_text">
                        <span class="typeGreen">비밀번호가 기억나지않으세요?<br> 비밀번호를 찾고자 하는 아이디를 입력해 주세요.<br></span>
                     </p>
                    <div>
                        <label for="userId" class="hid">아이디</label>
                        <input id="userId" name="userId" type="text"  placeholder="가입하신 아이디를 입력해 주세요.">
						<p id="idError" class="error" style="font-size: 14px;"></p>
                        
                      	<button disabled='disabled' id="findPw_next" class="next">다음</button>
                        <p class="member_warntxt typeGreen">
                           <a href="./findId"> * 아이디가 기억나지 않는다면?</a><br>
                        </p>
                    </div>
                    <div class="btn_member_wrap">
                        <ul>
                            <li><a href="./join">회원가입</a></li>
                            <li><a href="./findId">아이디 찾기</a></li>
                            <li class="last"><a href="./findPw">비밀번호 찾기</a></li>
                        </ul>
                    </div><!--.btn_member_wrap -->
                </section>
            </fieldset>	
        </form>
    </div><!--#container_in-->
</div><!--#container-->
<%@ include file="../includes/footer.jsp" %>
<script src="../resources/js/member_findPw.js"></script>
</body>
</html>