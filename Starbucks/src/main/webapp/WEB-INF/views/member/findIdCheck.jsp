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
        <div id="container_in">
                <form>
                    <fieldset>
                        <legend class="hid">아이디찾기 폼</legend>
                        <h1>아이디 찾기</h1>
                        <section>
                             <p class="member_info_text">
                                <span class="typeGreen">고객님의 정보와 일치하는 아이디 목록입니다.<br></span>
                             </p>
							<div class="member_info_box">
                       			<p>회원님의 아이디는 <br><span class="typeGreen"> ${MemberDTO.userId} </span>입니다</p>
                       			<p>가입날짜 :<span class="typeGreen"> ${MemberDTO.date} </span></p>
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
<script src="../resources/js/member_personalConfirm.js"></script>
</body>
</html>