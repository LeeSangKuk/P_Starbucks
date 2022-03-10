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
        <div id="loginWrap" class="memberWrap">
            <div id="loginWrapInner" class="memberWrapInner">
                <form id="loginForm" class="memberBox" action="../main" method="post">
                    <fieldset>
                        <legend class="hid">회원가입 이용약관 동의, 수집하는 개인정보의 항목, 개인정보의 수집 및 이용목적, 개인정보의 보유 및 이용기간 및 파기절차, 파기 방법에 관한 폼</legend>
                        <h1 >로그인</h1>
                        <section>

                             <p class="memberInfoTxt">
                                <span class="typeGreen">Welcome!</span> 스타벅스 코리아에 오신 것을 환영합니다.
                             </p>
                            
                            <div class="loginFormBox">
                                <label for="userId" class="hid">아이디</label>
                                <input id="userId" name="userId" class="loginInput" type="text"  placeholder="아이디를 입력해 주세요.">
                                <br>
                                <label for="userPw" class="hid">비밀번호</label>
                                <input id="userPw" name="userPw" class="loginInput" type="password" placeholder="비밀번호를 입력해 주세요." autocomplete="off">
								<p id="loginError"  style="font-size: 14px;"></p>
								
                                <span class="checkWrap">
                                    <input type="checkbox" class="saveId" name="saveId" id="saveId" value="y">
                                    <label for="saveId">아이디 저장</label>
                                </span>
                                
                                <p class="btn_login_wrap">
                                    <button type="submit" id="submit" name="submit" class="btn_login">로그인</button>
                                </p>
                                <p class="warntxt_member typeGreen">
                                    * 타 사이트와 비밀번호를 동일하게 사용할 경우 도용의 위험이 있으므로, 정기적인 비밀번호 변경을 해주시길 바랍니다.<br>
                                    * 스타벅스 코리아의 공식 홈페이지는 Internet Explorer 9.0 이상, Chrome, Firefox, Safari 브라우저에 최적화 되어있습니다.
                                </p>
                            </div>
                            <div class="btn_member_wrap">
                                <ul>
                                    <li><a href="./join">회원가입</a></li>
                                    <li><a href="./findId">아이디 찾기</a></li>
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
<script src="../resources/js/login.js"></script>
</body>
</html>