/**
 * 
 */

$(document).ready(function(){
	// * 파일의 크기와 확장자를 검사하는 함수 선언 *
	// -> 매개변수를 통해 파일의 크기와 확장자를 받아오기
	
	// 서버에서 설정해놓은 파일 크기 설정
	var maxSize = 5242880; // 5mb로 지정
	
	// 서버에서 허용 가능한 확장자 설정
	var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
	
	// 함수 선언
	function checkExtension(fileSize, fileName){
		// * 1.파일 크기 비교 *
		// 사용자가 선택한 파일 크기가 서버에서 설정해놓은 파일의 크기보다 크거나 같으면
		// if(사용자가 선택한 파일 크기 >= 서버에서 설정해놓은 max 파일 크기)
		if(fileName >= maxSize){
			alert("파일 사이즈 초과")
			return false;
		}
		
		
		// * 2.파일 확장자 비교 *
		// 사용자가 선택한 파일의 확장자가 서버에서 허용안되게 설정해놓은 확장자와 일치하면
		if(regex.test(fileName)){
			alert("해당 종류의 파일은 업로드 할 수 없습니다.");
			return false;
		}
		return true;
		
		
	}// function checkExtension 끝
	//---------------------------------------------------
	
	$("input[type='submit']").on("click", function(){
		//alert("aaa");
		
		// 가상의 form 태그
		var formData = new FormData();
		var inputFile = $("input[name='uploadFile']");
		var files = inputFile[0].files;
		console.log(files);
		
		for(var i=0; i<files.length; i++){
			// 파일 크기 비교를 위해 checkExtension 함수 호출
			if(checkExtension(files[i].size, files[i].name)){
				
			}// 아니면 아래 식 실행 X
			// append를 통해서 데이터 누적시키기 위한 식
			formData.append("uploadFile", files[i]);
		}
		
		
		// ajax를 이용해서 formData 자체를 데이터로 전송
		// formData를 데이터로 전송할 때에는 processData와 contentType은 반드시 false
		$.ajax({
			url: "/uploadAjaxAction",
			type: "post",
			data: formData,
			processData: false,
			contentType: false,
			success: function(result){
				showUploadedFile(result);
			}
		})
		
		
		
	})
})