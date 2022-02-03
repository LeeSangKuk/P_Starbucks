/**
 * 
 */

$(document).ready(function(){
	// 현재 페이지 번호를 클릭하면
	var actionForm = $("#actionForm");
	$(".paginate_button a").on("click", function(e){
		e.preventDefault();
		actionForm.find("input[name='pageNum']").val($(this).attr("href"));
		actionForm.submit();
	})
	//---------------------------------------------------------
	// 검색 버튼을 클릭하면
	$("input[type='submit']").on("click", function(e){
		e.preventDefault();
		actionForm.find("input[name='pageNum']").val("1")
		actionForm.submit();
	})
	
	// 검색창에 키워드를 입력하고 엔터만 눌러도 검색이 될 수 있게 이벤트 추가
	// 1.입력한 내용을 받아오는 keyword 변수 설정
	var keyword = $(".s_sc").html();
	
	// 2.함수 작성
	$(".s_sc").keydown(function(keyNum){
		// 현재의 키보드의 입력값을 keyNum으로 받음
		if(keyNum.keyCode == 13){
			// keydown으로 발생한 keyNum의 숫자체크
			// 숫자가 enter의 아스키코드 13과 같으면 
			// 기존에 정의된 클릭함수를 호출
			$("input[type='submit']").click()
		}
	})
	
	
	
//	var pageBtn = $("ul");
//	pageBtn.find("li").click(function(){
//		// pageBtn.removeClass("active");
//		$(this).parent().addClass("active");
//	})
	
})