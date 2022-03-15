<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <div class="memberWrap">
            <div class="memberWrapInner">
                <form id="" class="memberBox" action="../member/findPw3" method="post">
                    <fieldset>
                        <legend class="hid">비밀번호찾기 폼</legend>
                        <h1>비밀번호 찾기</h1>
                        <section>
                             <p class="memberInfoTxt">
                                <span class="typeGreen">이메일 본인인증으로 비밀번호를 확인하실 수 있습니다.</span>
                             </p>
							<div class="">
                       			<p>가입된 아이디의 이메일 정보는<br><span class="typeGreen">${mask_email}</span>입니다</p>
	                        	<br>
                                <label for="userName" class="hid">이름</label>
                                <input id="userName" name="userName" class="loginInput" type="text"  placeholder="가입하신 이름을 입력해 주세요.">
                                <br>
                                <label for="userEmail" class="hid">이메일</label>
                                <input id="userEmail" name="userEmail" class="loginInput" type="email" placeholder="가입하신 이메일을 입력해 주세요.">
								<p id="loginError"  style="font-size: 14px;"></p>
							
                                
                                <div class="btn_login_wrap">
									<input type="text" id="confirmNum" class="confirmNum" name="confirmNum" value="" placeholder="인증번호를 입력하세요." disabled>
									<button type="button" id="bt_emailconfirm" class="bt_emailconfirm" name="bt_emailconfirm">인증번호 발송</button>
                                	<p id="emailError" style="font-size: 14px;"></p>
                                </div>
	                        <button class="next" id="findPw2_next">다음</button>
							</div>
                            <div class="btn_member_wrap">
                                <ul>
                                    <li><a href="./join">회원가입</a></li>
                                    <li><a href="./findId">아이디 찾기</a></li>
                                    <li><a href="./findPw">비밀번호 찾기</a></li>
                                </ul>
                            </div>
                        </section>
                    </fieldset>	
                </form><!--#loginForm-->
            </div><!--#loginWrapInner-->
        </div><!--#loginWrap-->
        <!-- 내용 end -->
    </div><!--#Container-->
<%@ include file="../includes/footer.jsp" %>
<script src="../resources/js/findPw.js"></script>
<script src="../resources/js/findMember.js"></script>
</body>
</html>