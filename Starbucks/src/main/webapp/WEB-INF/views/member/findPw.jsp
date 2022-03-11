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
 <div id="Container">
        <div id="loginWrap">
            <div class="memberWrapInner">
                <form id="loginForm" action="../main" method="post">
                    <fieldset>
                        <legend class="hid">비밀번호 찾기 폼</legend>
                        <h1>비밀번호 찾기</h1>
                        <section>
                             <p class="memberInfoTxt">
                                <span class="typeGreen">비밀번호가 기억나지않으세요?<br>비밀번호를 찾고자 하는 아이디를 입력해 주세요.<br></span>
                             </p>
                            
                            <div>
                                <label for="userId" class="hid">아이디</label>
                                <input id="userId" name="userId" class="loginInput" type="text"  placeholder="가입하신 아이디를 입력해 주세요.">
								<p id="loginError"  style="font-size: 14px;"></p>

                                
                              	<button type="button" disabled='disabled' class="next" id="next">다음</button>
                                <p class="warntxt_member typeGreen">
                                   <a href="./findId"> * 아이디가 기억나지 않는다면?</a><br>
                                </p>
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
</body>
</html>