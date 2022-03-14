var findPwToken = false;

$(document).ready(function(){
	
	$("#userId").blur(function() {
		var userId = $("#userId").val(); //사용자의 아이디 입력값
		var userEmail = $("#userEmail").val(); //사용자의 이메일 입력값

		$.ajax({
            url: 'postFindPw',
            data: {
                "userId": userId
            },
            type: "POST",
            dataType: "json",
            success: function(cnt){ //컨트롤러에서 넘어온 data
				console.log("cnt : "+cnt)
				if (cnt == 1) {   //인증 키 값을 비교를 위해 텍스트인풋과 벨류를 비교
					$("#findPw_next").attr("disabled", false); //disabled 해제
					$("#loginError").text("")
					findPwToken = true;
					console.log("cnt == 1 : "+cnt)
				}
				else{
					$("#loginError").text("입력하신 회원정보가 존재하지 않습니다.").css("color", "red");
					console.log("else : "+cnt)
					findPwToken = false;
				}


			}// success 끝
		})// ajax 끝
	});

	$("#findPw_next").click(function(){
		if(findPwToken == false){
			alert("잘못된 접근입니다.")
		} else{
			let url = "findPw2";
			location.replace(url);
		}

	})
	
	
})
