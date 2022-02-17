<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/Join.css">
<%@ include file="../includes/header.jsp" %>
	<div id="container">
      <h1>회원가입</h1>
      <div id="containerIn">
        <div class="info">
            <p class="infoImg"></p>
            <p class="infoText">회원정보를 입력해주세요.</p>
        </div>
		<!-- action: (form data)를 서버로 보낼 때 해당 데이터가 도착할 URL을 명시-->
        <form action="/member/join" method="post" id="joinForm" name="joinForm">
			<section class="memberSection1">
				<div class="idBox">
                    <p><label for="userId"><strong>아이디</strong></label></p>	
                    <input type="text" name="userId" id="userId" value="" placeholder="사용하실 아이디를 입력해주세요">
                	<p id="idError"  style="font-size: 14px;"></p>
               </div>
				<div class="pwBox">
					<p><label for="userPw"><strong>비밀번호</strong></label></p>
                    <input type="password" name="userPw" id="userPw" value="" placeholder="영문자+숫자+특수문자 조합하여 8~16자리로 입력해주세요">
					<p id="pwError"  style="font-size: 14px;"></p>
				</div>
				<div class="pwCkBox">
					<p><label for="userPwCheck"><strong>비밀번호 재확인</strong></label></p>
                    <input type="password" name="userPwCheck" id="userPwCheck" value="" placeholder="비밀번호 재확인">
					<p id="pwCkError"  style="font-size: 14px;"></p>
				</div>
			</section>
			<!--.section1-->
	

            
	
			<section class="memberSection2">
				<div class="nameBox">
					<p><label><strong>이름<span class="typeGreen">(필수)</span></strong></label></p>
					<input type="text" id="userName" name="userName" placeholder="이름을 입력하세요.">
					<p id="nameError"  style="font-size: 14px;"></p>
				</div>

                <div class="genderBox">
                    <p><label><strong>성별<span class="typeGreen">(필수)</span></strong></label></p>
					<div>
						<select name="userGender" id="userGender">
							<option value="">선택</option>
							<option value="male">남</option>
							<option value="female">여</option>
						</select>
					</div>
					<p id="genderError"  style="font-size: 14px;"></p>
                </div>

				<div class="birthBox">
					<p><label><strong>생년월일<span class="typeGreen">(필수)</span></strong></label></p>
					<div>
						<select name="userBirthYear" id="userBirthYear">
							<option value="">선택</option>
							<option value="1990">1990</option>
							<option value="1991">1991</option>
							<option value="1992">1992</option>
							<option value="1993">1993</option>
							<option value="1994">1994</option>
							<option value="1995">1995</option>
							<option value="1996">1996</option>
							<option value="1997">1997</option>
							<option value="1998">1998</option>
							<option value="2000">2000</option>
							<option value="2001">2001</option>
							<option value="2002">2002</option>
							<option value="2003">2003</option>
							<option value="2004">2004</option>
							<option value="2005">2005</option>
							<option value="2006">2006</option>
							<option value="2007">2007</option>
							<option value="2008">2008</option>
							<option value="2009">2009</option>
							<option value="2010">2010</option>
							<option value="2011">2011</option>
							<option value="2012">2012</option>
							<option value="2013">2013</option>
							<option value="2014">2014</option>
							<option value="2015">2015</option>
							<option value="2016">2016</option>
							<option value="2017">2017</option>
							<option value="2018">2018</option>
							<option value="2019">2019</option>
							<option value="2020">2020</option>
							<option value="2021">2021</option>
							<option value="2022">2022</option>
						</select>
						<select name="userBirthMonth" id="userBirthMonth">
							<option value="">선택</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
						</select>
						<select name="userBirthDay" id="userBirthDay">
							<option value="">선택</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
						</select> 
						<select name="userBirthFlag" id="userBirthFlag">
							<option value="">선택</option>
							<option value="s">양력</option>
							<option value="m">음력</option>
						</select>
					</div>
					<p id="birthError"  style="font-size: 14px;"></p>
				</div>

				<div class="phoneBox">
					<p><label><Strong>휴대폰<span class="typeGreen">(필수)</span></Strong></label></p>
					<input type="text" id="userPhone" name="userPhone" value="" placeholder="휴대폰 번호를 입력하세요.">
					<p id="phoneError"  style="font-size: 14px;"></p>
				</div>

				<div class="emailBox">
					<p><label><Strong>이메일<span class="typeGreen">(필수)</span></Strong></label></p>
					<input type="email" id="userEmail" name="userEmail" value="" placeholder="E-mail을 입력하세요.">
					<p id="emailError"  style="font-size: 14px;"></p>
				</div>
			</section>
			<!--.section2-->
            <input type="submit" id="submit" class="submit" value="완료하기">
        </form>
      </div><!--#containerIn-->
    </div><!--#container-->
	<script src="../resources/js/join.js"></script>
<%@ include file="../includes/footer.jsp" %>