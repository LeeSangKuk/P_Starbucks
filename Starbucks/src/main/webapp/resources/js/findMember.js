var emailKeyToken = false

$(document).ready(function(){
	
	// 인증번호 발송 버튼 클릭시
	$("#bt_emailconfirm").click(function() {
		var userName = $("#userName").val(); //사용자의 이름 입력값
		var userEmail = $("#userEmail").val(); //사용자의 이메일 입력값

		$.ajax({
            url: 'postFindId',
            data: {
                "userName": userName,
                "userEmail": userEmail
            },
            type: "POST",
            dataType: "json",
            success: function(cnt){ //컨트롤러에서 넘어온 data
				console.log("cnt : "+cnt)
				if (cnt == 1) {   //인증 키 값을 비교를 위해 텍스트인풋과 벨류를 비교
					$("#confirmNum").attr("disabled", false); //disabled 해제
					console.log("cnt == 1 : "+cnt)
					$.ajax({
						url : '/sendMail',
						type : 'post',
						data : JSON.stringify(userEmail),
						datatype : 'json', // 서버에서 데이터를 받아올 때 타입
						contentType : "application/json", // 서버에 데이터를 요청할 때 타입
						success : function(key){

							console.log(key)
							
							$("#confirmNum").blur(function() {
								if ($("#confirmNum").val() == key) {   //인증 키 값을 비교를 위해 텍스트인풋과 벨류를 비교
									$("#emailError").text("인증번호가 일치합니다.").css("color", "green");
									$(".next").attr("disabled", false);
									emailKeyToken = true;  //인증 성공여부 check
									
								} else {
									$("#emailError").text("인증번호가 불일치합니다.").css("color", "red");
									emailKeyToken = false; //인증 실패
								}
							})
							
						}// success 끝
					
					})// ajax 끝
					alert("인증번호 발송완료!");
				} else {
					$("#emailError").text("입력하신 회원정보가 존재하지 않습니다.").css("color", "red");
					console.log("else : "+cnt)
				}
					

			}// success 끝
		})// ajax 끝
	});

	
	
	
	
	// findId.jsp의 다음 버튼 클릭시
	$("#next").click(function(){
		if(emailKeyToken == false){
			alert("잘못된 접근입니다.")
		} else{
			let url = "findIdCheck";
			location.replace(url);
		}

	})
	
	// findPw.jsp의 다음버튼을 클릭시
	$("#findPw_next").click(function(){
		if(findPwToken == false){
			alert("잘못된 접근입니다.")
		} else{
			let url = "findPw2";
			location.replace(url);
		}

	})
	
	// findPw2.jsp의 다음버튼을 클릭시
	$("#findPw2_next").click(function(){
		if(emailKeyToken == false){
			alert("잘못된 접근입니다.")
		} else{
			let url = "findPw3";
			location.replace(url);
		}

	})
	
	
})

	