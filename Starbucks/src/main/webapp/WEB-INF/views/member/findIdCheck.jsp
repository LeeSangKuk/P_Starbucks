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
                                <span class="typeGreen">고객님의 정보와 일치하는 아이디 목록입니다.<br></span>
                             </p>
                            
                            <div class="loginFormBox">
								<div>
									<ul class="list_id">
										<li>
											<strong>
												<input type="radio" name="" id="" value=""> 
												<label for="" class="">85807328</label>
											</strong>
											<span>가입 : 2005.06.13</span>
											<input type="hidden" name="" value="85807328">
										</li>
									</ul>
								</div>
                                <div class="btn_area">
									<a href="#" onclick="login();clickcr(this,'uid.login','','',event);" class="btn_login2"><span class="blind">로그인하기</span></a>
									<a href="#" onclick="popup_change_passwd();clickcr(this,'uid.pwinquiry','','',event);" class="btn_findpw"><span class="blind">비밀번호 찾기</span></a>
								</div>
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