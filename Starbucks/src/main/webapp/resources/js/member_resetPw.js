// 정규식
const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;

// 토큰
var pwToken = false;
var pwCkToken = false;

$(document).ready(function(){
	
	//비밀번호 유효성검사
	$("#userPw").blur(function(){
	  if(!pwReg.test($("#userPw").val())){
		  $("#pwError").text("비밀번호는 영문자+숫자+특수문자 조합으로 8~16자리 사용해야 합니다.").css("color","red")
		  pwToken = false;
		  console.log('pw 실패')
	  }
	  else{
		  $("#pwError").text("올바른 비밀번호입니다.").css("color","green")
	      pwToken = true;
	      console.log('pw 성공')
	  }
	});
	
	//비밀번호재확인 유효성검사
	$("#userPwCheck").blur(function(){
	  if($("#userPwCheck").val() != $("#userPw").val()){
		  $("#pwCkError").text("입력하신 비밀번호와 맞지 않습니다.").css("color","red")
		  pwCkToken = false;
		  console.log('pwCk 실패')
		  console.log(pwCkToken)
	  }
	  else if($("#userPwCheck").val() == null){
		  $("#pwCkError").text("비밀번호를 입력해주세요.").css("color","red")
		  pwCkToken = false;
		  console.log('pwCk null 실패')
		  console.log(pwCkToken)
	  }
	  else{
		  $("#pwCkError").text("입력하신 비밀번호와 일치합니다.").css("color","green")
		  pwCkToken = true;
	      console.log('pwCk 성공')
		$("#findPw3_next").attr("disabled", false);
	  }
	});
	
	//findPw3.jsp 다음 버튼을 클릭하면
	$("#findPw3_next").click(function(){
		
		var userId =  $("#userId").text();// 사용자 아이디
		var userPw =  $("#userPw").val(); // 사용자의 새 비밀번호
		
		// 토큰 값이 true이면
		if(pwToken == true && pwCkToken == true){

			$.ajax({
	            url: 'resetPw',
	            data: {
	            	"userId": userId,
	                "userPw": userPw
	            },
	            type: "POST",
	            dataType: "json",
	            success:function(cnt){
	                alert("비밀번호 변경 완료! 로그인 페이지로 이동합니다.");
	    			let url = "/member/login";
	    			location.replace(url);
	            }// success 끝
			})
			// ajax 끝
		}// if 끝
		
		else{
			alert("잘못된 접근입니다.")
		}

	})
	
})