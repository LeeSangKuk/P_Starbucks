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
        <div class="memberWrap">
            <div class="memberWrapInner">
                <form id="" class="memberBox" action="member/postFindPw" method="post">
                    <fieldset>
                        <legend class="hid">비밀번호찾기 폼</legend>
                        <h1>비밀번호 재설정</h1>
                        <section>
                             <p class="memberInfoTxt">
                                <span class="typeGreen">비밀번호를 변경해 주세요.
								<br>다른 아이디나 사이트에서 사용한 적 없는 안전한 비밀번호로 변경해 주세요.</span>
                             </p>
                             
							<div class="getIdBox">
								<c:choose>
	                        		<c:when test="${getPw_id!=null}">
	                        			<p>아이디 : <span class="typeGreen"> ${getPw_id} </span></p>
	                        		</c:when>                  	
	                        	</c:choose>
	                        	<br>
                                <label for="userPw" class="hid">새 비밀번호</label>
                                <input id="userPw" name="userPw" class="loginInput" type="password"  placeholder="새 비밀번호">
                                <p id="pwError"  style="font-size: 14px;"></p>
                                <br>
                                <label for="userPwCheck" class="hid">새 비밀번호 확인</label>
                                <input id="userPwCheck" name="userPwCheck" class="loginInput" type="password" placeholder="새 비밀번호 확인">
								<p id="pwCkError"  style="font-size: 14px;"></p>

	                        <button type="button" disabled='disabled' class="next" id="findPw3_next">다음</button>
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

<script src="../resources/js/resetPw.js"></script>
<script src="../resources/js/findMember.js"></script>
</body>
</html>