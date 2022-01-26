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
	
	// 검색 버튼을 클릭하면
	$("input[type='submit']").on("click", function(e){
		e.preventDefault();
		actionForm.find("input[name='pageNum']").val("1")
		actionForm.submit();
	})
})