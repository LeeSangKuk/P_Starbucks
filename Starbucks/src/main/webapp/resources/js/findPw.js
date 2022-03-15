$(document).ready(function(){

	// 다음버튼을 클릭했을 시
	$("#findPw_next").click(function(e) {
		e.preventDefault(); //제출 이벤트 제거
		
		var userId = $("#userId").val(); //사용자의 아이디 입력값

		$.ajax({
            url: 'postFindPw',
            data: {
                "userId": userId
            },
            type: "POST",
            dataType: "json",
            success: function(cnt){ //컨트롤러에서 넘어온 data
				if (cnt == 1) {   //입력한 아이디가 회원정보에 존재하면
					$("#loginError").text("")
					
					let url = "findPw2";
					location.replace(url);// findPw2 페이지로 넘어가라
				}
				else{
					$("#loginError").text("입력하신 회원정보가 존재하지 않습니다.").css("color", "red");
				}
			}// success 끝
		})// ajax 끝
	});
	
	
})
