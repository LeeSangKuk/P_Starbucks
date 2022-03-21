$(document).ready(function(){

	// 다음버튼을 클릭했을 시
	$("#userId").blur(function() {
		var userId = $("#userId").val(); //사용자의 아이디 입력값
		$.ajax({
            url: 'findPw_userId',
            data: {
                "userId": userId
            },
            type: "POST",
            dataType: "json",
            success: function(cnt){ //컨트롤러에서 넘어온 data
				if (cnt == 1) {   //입력한 아이디가 회원정보에 존재하면
					$("#findPw_next").attr("disabled", false); //disabled 해제
				}
				else{
					$("#idError").text("입력하신 회원정보가 존재하지 않습니다.").css("color", "red");
				}
			}// success 끝
		})// ajax 끝
	});
	
	
})
