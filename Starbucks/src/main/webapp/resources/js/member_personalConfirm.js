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
				
				if (cnt == 1) {   //입력한 이름과 이메일이 회원정보에 존재하면
					$("#confirmNum").attr("disabled", false); //disabled 해제
			
					$.ajax({
						url : '/sendMail', // 메일전송 컨트롤러
						type : 'post',
						data : JSON.stringify(userEmail),
						datatype : 'json', // 서버에서 데이터를 받아올 때 타입
						contentType : "application/json", // 서버에 데이터를 요청할 때 타입
						success : function(key){

							console.log(key)
							
							$("#confirmNum").blur(function() {
								if ($("#confirmNum").val() == key) {   //인증 키 값을 비교를 위해 텍스트인풋과 벨류를 비교
									$("#emailError").text("인증번호가 일치합니다.").css("color", "green");
									emailKeyToken = true;  //인증 성공여부 check
									
									$("#findId_next").attr("disabled", false); //disabled 해제
									$("#findPw2_next").attr("disabled", false); //disabled 해제
									
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

})

	