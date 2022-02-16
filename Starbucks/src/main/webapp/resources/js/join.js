//정규식
const idReg =  /^[a-z]+[a-z0-9]{5,19}$/g;
const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;
const nameReg = /^[가-힣a-zA-Z]+$/;
const phoneReg = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/;
const emailReg = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
const emailReg2 = /[ㄱ-ㅎ가-힣]/g;

//토큰
var idToken = false
var pwToken = false
var pwCkToken = false
var nameToken = false
var genderToken = false
var birthToken = false
var phoneToken = false
var emailToken = false

$(document).ready(function(){
	// 아이디 유효성검사
	 $("#userId").blur(function(){
		$.ajax({
		    url:"checkId", //Controller에서 인식할 주소
		    type:"post", //POST 방식으로 전달
		    data: {"userId":$("#userId").val()},
		    dataType:"json",
		    success:function(cnt){ //컨트롤러에서 넘어온 cnt값을 받는다 
		        if(cnt == 0){ //cnt가 0이 아니면 -> 사용 가능한 아이디 
					  $("#idError").text("사용가능한 아이디입니다.")
					  $("#idError").css("color","green")
				      idToken = true;
				      console.log("id 성공")
		        } 
		        else if(cnt != 0){
				      $("#idError").text("이미 존재하는 아이디입니다.")
					  $("#idError").css("color","red")
					  idToken = false;
					  console.log("id 실패")
		        } 
		        else if(!idReg.test($("#userId").val())){
		        	  $("#idError").text("아이디는 영문자로 시작하는 6~20자 영문자 또는 숫자이어야 합니다.")
		        	  $("#idError").css("color","red")
					  idToken = false;
					  console.log("id 실패")
		        }
		        else{
		        	
		        }
		        console.log("cnt : "+cnt);
		    },
		    error:function(){
		        alert("에러입니다");
		    }
		})
	 });
	
	//비밀번호 유효성검사
	$("#userPw").blur(function(){
	  if(!pwReg.test(userPw.value)){
		  $("#pwError").text("비밀번호는 영문자+숫자+특수문자 조합으로 8~16자리 사용해야 합니다.")
		  $("#pwError").css("color","red")
		  pwToken = false;
		  console.log('pw 실패')
	  }
	  else{
		  $("#pwError").text("올바른 비밀번호입니다.")
		  $("#pwError").css("color","green")
	      pwToken = true;
	      console.log('pw 성공')
	  }
	});
	
	//비밀번호재확인 유효성검사
	$("#userPwCheck").blur(function(){
	  if($("#pwCkError").value !== $("#userPw").value){
		  $("#pwCkError").text("입력하신 비밀번호와 맞지 않습니다.")
		  $("#pwCkError").css("color","red")
		  pwCkToken = false;
		  console.log('pwCk 실패')
	  }
	  else{
		  $("#pwCkError").text("입력하신 비밀번호와 일치합니다.")
		  $("#pwCkError").css("color","green")
		  pwCkToken = true;
	      console.log('pwCk 성공')
	  }
	});
	
	//이름 유효성검사
	$("#userName").blur(function(){
		if(!nameReg.test($("#userName").value)){
			$("#nameError").text("한글과 영문 대 소문자를 사용하세요. (특수기호, 공백 사용 불가)")
			$("#nameError").css("color","red")
			nameToken = false;
			console.log('name 실패')
		}
		else{
			$("#nameError").text("멋진 이름이네요!")
			$("#nameError").css("color","green")
			nameToken = true;
			console.log('name 성공')
		}
	});

	//성별 유효성검사
	$("#userGender").change(function(){
		if($("#userGender").val() == ""){
			$("#genderError").text("필수 정보입니다.")
			$("#genderError").css("color","red")
			genderToken = false;
			console.log('gender 실패')
		}
		else{
			$("#genderError").text("")
			genderToken = true;
			console.log('gender 성공')
		}
		
	});
	
	//생년월일 유효성검사
	//년
	$("#userBirthYear").change(function(){
		if($("#userBirthYear").val() == '' || $("#userBirthMonth").val() == '' || $("#userBirthDay").val() == '' || $("#userBirthFlag").val() == ''){
			$("#birthError").text("필수 정보입니다.")
			$("#birthError").css("color","red")
			birthToken = false;
			console.log('year 실패')
		}
		else{
			$("#birthError").text("")
			birthToken = true;
			console.log('year 성공')
		}
		
	});
	
	//월
	$("#userBirthMonth").change(function(){
		if($("#userBirthYear").val() == '' || $("#userBirthMonth").val() == '' || $("#userBirthDay").val() == '' || $("#userBirthFlag").val() == ''){
			$("#birthError").text("필수 정보입니다.")
			$("#birthError").css("color","red")
			birthToken = false;
			console.log('month 실패')
		}
		else{
			$("#birthError").text("")
			birthToken = true;
			console.log('month 성공')
		}
	})

	
	//일
	$("#userBirthYear").change(function(){
		if($("#userBirthYear").val() == '' || $("#userBirthMonth").val() == '' || $("#userBirthDay").val() == '' || $("#userBirthFlag").val() == ''){
			$("#birthError").text = '필수 정보입니다.'
			$("#birthError").css("color","red")
			birthToken = false;
			console.log('day 실패')
		}
		else{
			$("#birthError").text("")
			birthToken = true;
			console.log('day 성공')
		}
	})
	
	//양/음력
	$("#userBirthFlag").change(function(){
		if($("#userBirthYear").val() == '' || $("#userBirthMonth").val() == '' || $("#userBirthDay").val() == '' || $("#userBirthFlag").val() == ''){
			$("#birthError").text = '필수 정보입니다.'
			$("#birthError").css("color","red")
			birthToken = false;
			console.log('flag 실패')
		}
		else{
			$("#birthError").text("")
			birthToken = true;
			console.log('flag 성공')
		}
	})
	
	//핸드폰 유효성검사
	$("#userPhone").blur(function(){
		if($("#userPhone").val() == ""){
			$("#phoneError").text("필수 정보입니다.")
			$("#phoneError").css("color","red")
			phoneToken = false;
			console.log('phone 실패')
		}
		else if(!phoneReg.test($("#userPhone").val())){
			$("#phoneError").text("형식에 맞지 않는 번호입니다.")
			$("#phoneError").css("color","red")
			phoneToken = false;
			console.log('phone 형식 실패')
		}
		else{
			$("#phoneError").text("")
			phoneToken = true;
			console.log('phone 성공')
		}
	})
	
	//이메일 유효성검사
	$("#userEmail").blur(function(){
		if($("#userEmail").val() == ""){
			$("#emailError").text("필수 정보입니다.")
			$("#emailError").css("color","red")
			emailToken = false;
			console.log('email 실패')
		}
		else if(!emailReg.test($("#userEmail").val()) || emailReg2.test($("#userEmail").val())){
			alert($("#userEmail").val());
			$("#emailError").text("형식에 맞지 않는 이메일입니다.")
			$("#emailError").css("color","red")
			emailToken = false;
			console.log('email 형식 실패')
		}
		else{
			$("#emailError").text("")
			emailToken = true;
			console.log('email 성공')
		}
	})


	//최종 전체 유효성 검사 후 회원가입 완료 안내
	function Welcome(){
	   if(!idToken) {
	       alert("아이디 형식을 확인하세요.");
	       return false;
	   }
	   else if(!pwToken) {
	 	  alert("비밀번호 형식을 확인하세요.");
	 	  	return false;
	   }
	   else if(!pwCkToken) {
	 	  alert("비밀번호가 일치한지 확인하세요.");
	 	  	return false;
	   }
	   else if(!nameToken) {
	   	alert("이름 형식을 확인하세요.");
	   	return false;
	   }
	   else if(!genderToken) {
	   	alert("성별을 선택했는지 확인하세요.");
	   	return false;
	   }
	   else if(!birthToken) {
	   	alert("생년월일을 올바르게 선택했는지 확인하세요.");
	   	return false;
	   }
	   else if(!emailToken){
		    alert("이메일 형식을 확인하세요.");
		    return false;
		}
	   else if(!phoneToken){
		    alert("휴대폰 형식을 확인하세요.");
		    return false;
		}
	   else{
			alert("안녕하세요 "+$("#userId").val()+"님 가입을 환영합니다. :)");
			return true;
		}
	}
	 
});