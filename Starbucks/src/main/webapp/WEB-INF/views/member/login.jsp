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
        <form action="../main" method="post">
            <fieldset>
                <legend class="hid">로그인 폼</legend>
                <h1 >로그인</h1>
                <section>
                     <p class="member_info_text">
                        <span class="typeGreen">Welcome!</span> 스타벅스 코리아에 오신 것을 환영합니다.
                     </p>
                    
                    <div>
                        <label for="userId" class="hid">아이디</label>
                        <input id="userId" name="userId" class="input_login" type="text"  placeholder="아이디를 입력해 주세요.">
                        
                        <label for="userPw" class="hid">비밀번호</label>
                        <input id="userPw" name="userPw" class="input_login" type="password" placeholder="비밀번호를 입력해 주세요." autocomplete="off">
						<p id="loginError"  style="font-size: 14px;"></p>

                        <span class="saveId_wrap">
                            <input type="checkbox" class="saveId" name="saveId" id="saveId" value="y">
                            <label for="saveId">아이디 저장</label>
                        </span>
                        
                        <p class="btn_login_wrap">
                            <button id="submit" name="submit" class="btn_login">로그인</button>
                        </p>
                        <p class="member_warn_text typeGreen">
                            * 타 사이트와 비밀번호를 동일하게 사용할 경우 도용의 위험이 있으므로, 정기적인 비밀번호 변경을 해주시길 바랍니다.<br>
                        </p>
                    </div>
                    
                    <div class="btn_member_wrap">
                        <ul>
                            <li><a href="./join">회원가입</a></li>
                            <li><a href="./findId">아이디 찾기</a></li>
                            <li class="last"><a href="./findPw">비밀번호 찾기</a></li>
                        </ul>
                    </div>
                </section>
            </fieldset>	
        </form>
    </div><!--#container_in-->
</div><!--#container-->
<%@ include file="../includes/footer.jsp" %>
<script src="../resources/js/member_login.js"></script>
</body>
</html>