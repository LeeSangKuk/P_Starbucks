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
       <form action="../member/findIdCheck" method="post">
           <fieldset>
               <legend class="hid">아이디찾기 폼</legend>
               <h1>아이디 찾기</h1>
               <section>
                    <p class="member_info_text">
                       <span class="typeGreen">아이디가 기억나지않으세요?<br>이메일 본인인증을 통해 아이디를 확인하실 수 있습니다.<br></span>
                    </p>
                   
                   <div>
                       <label for="userEmail" class="hid">이름</label>
                       <input id="userName" name="userName" type="text"  placeholder="가입하신 이름을 입력해 주세요.">
                       <br>
                       <label for="userPw" class="hid">이메일</label>
                       <input id="userEmail" name="userEmail" type="email" placeholder="가입하신 이메일을 입력해 주세요.">					
                       
                       <div class="email_confirm_wrap">
							<input type="text" id="confirmNum" class="confirmNum" name="confirmNum" value="" placeholder="인증번호를 입력하세요." disabled>
							<button type="button" id="btn_emailconfirm" class="btn_emailconfirm" name="btn_emailconfirm">인증번호 발송</button>
                       		<p id="emailError" class="error" style="font-size: 14px;"></p>
                        </div>
                        
                      	<button disabled='disabled' class="next" id="findId_next">다음</button>
                        <p class="member_warn_text typeGreen">
                            * 본인확인 이메일 주소와 입력한 이메일 주소가 같아야, 인증번호를 받을 수 있습니다.<br>
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
<script src="../resources/js/member_personalConfirm.js"></script>
</body>
</html>