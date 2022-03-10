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
                <form id="loginForm" class="memberBox" action="../main" method="post">
                    <fieldset>
                        <legend class="hid">아이디찾기 폼</legend>
                        <h1>아이디 찾기</h1>
                        <section>
                             <p class="memberInfoTxt">
                                <span class="typeGreen">고객님의 정보와 일치하는 아이디 목록입니다.<br></span>
                             </p>
							<div class="getIdBox">
								<c:choose>
	                        		<c:when test="${getId!=null}">
	                        			<p>회원님의 아이디는 <br><span class="typeGreen"> ${getId.userId} </span>입니다</p>
	                        			<p>가입날짜 :<span class="typeGreen"> ${getId.date} </span></p>
	                        		</c:when>                  	
	                        	</c:choose>
							</div>
                            <div class="btn_member_wrap">
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