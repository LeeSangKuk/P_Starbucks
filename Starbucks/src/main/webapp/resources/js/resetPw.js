// 정규식
const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;

// 토큰
var findPwToken = false;
var pwToken = false;
var pwCkToken = false;

$(document).ready(function(){
	
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
		$(".next").attr("disabled", false);
	  }
	});
	
	$("#findPw3_next").click(function(){
		var userPw =  $("#userPw").val();
		if(pwToken == true && pwCkToken == true){
			alert("zz");
			$.ajax({
	            url: 'resetPw',
	            data: {
	                "userPw": userPw
	            },
	            type: "POST",
	            dataType: "json",
	            success:function(){
	                alert("비밀번호 변경 완료! 로그인 페이지로 이동합니다.");
	    			let url = "/main";
	    			location.replace(url);
	            }
			})
			// ajax 끝

		}
		else{
			alert("잘못된 접근입니다.")
		}

	})
	
	
})