<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/login.css">
</head>
<body>
<%@ include file="../includes/header.jsp" %>
 <div id="Container">
        <div id="loginWrap">
            <div id="loginWrapInner">
                <form id="loginForm" action="../main" method="post">
                    <fieldset>
                        <legend class="hid">아이디찾기 폼</legend>
                        <h1 class="loginTitle">아이디 찾기</h1>
                        <section class="loginSection">

                             <p class="loginFormTxt">
                                <span class="typeGreen">아이디가 기억나지않으세요?<br>이메일 본인인증을 통해 아이디를 확인하실 수 있습니다.<br></span>
                             </p>
                            
                            <div class="loginFormBox">
                                <label for="userEmail" class="hid">이름</label>
                                <input id="userName" name="userName" class="loginInput" type="text"  placeholder="가입하신 이름을 입력해 주세요.">
                                <br>
                                <label for="userPw" class="hid">이메일</label>
                                <input id="userEmail" name="userEmail" class="loginInput" type="email" placeholder="가입하신 이메일을 입력해 주세요.">
								<p id="loginError"  style="font-size: 14px;"></p>
							
                                
                                <p class="btnMemLogin">
									<input type="text" id="confirmNum" class="confirmNum" name="confirmNum" value="" placeholder="인증번호를 입력하세요." disabled>
									<button type="button" id="bt_emailconfirm" class="bt_emailconfirm" name="bt_emailconfirm">인증번호 발송</button>
                                	<p id="emailError"  style="font-size: 14px;"></p>
                                </p>
                                
                              	<button type="button" disabled='disabled' class="next" id="next">다음</button>
                                <p class="inputWarnText typeGreen">
                                    * 본인확인 이메일 주소와 입력한 이메일 주소가 같아야, 인증번호를 받을 수 있습니다.<br>
                                </p>
                            </div>
                            <div class="loginBtnWrap">
                                <ul>
                                    <li><a href="./join">회원가입</a></li>
                                    <li><a href="#">아이디 찾기</a></li>
                                    <li class="last"><a href="#">비밀번호 찾기</a></li>
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
<script src="../resources/js/findMember.js"></script>
</body>
</html>