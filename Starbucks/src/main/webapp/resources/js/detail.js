/**
 * 
 */

$(document).ready(function(){
	// bno 값
	var bno = $("#bno").val();
	// * uploaded file 보여주기 *
	// 상세페이지가 시작되자마자 이미지를 출력하기 위한 ajax
	// 별도의 자바스크립트 파일로 만들어서 detail.jsp에 연결해도 됨 -> 여기서는 그냥 detail.js에 작성
	$.getJSON("/board/fileList/" + bno + ".json", function(data){// boardController에 있는 fileList를 통해 얻어진 select 결과를 data에 저장한 후,
		
		// detail.jsp에 뿌리기
		console.log(data)
		
		var str = "";
		
		$(data).each(function(i,obj){ // data : select된 결과
			if(!obj.image){// 사용자가 업로드 한 파일의 타입이 이미지가 아니면(excel, ppt 등)
				var fileCallPath = encodeURIComponent(obj.uploadPath + "/" + obj.uuid + "_" + obj.fileName)
				
				str += "<li data-path='" + obj.uploadPath + "' data-uuid='" + obj.uuid
				str += "' data-name='" + obj.fileName + "' data-type='" + obj.image + "'>"
				str += "<a href='/download?fileName=" + fileCallPath + "'>" + obj.fileName + "</a></li>"
				
			}else{// 사용자가 업로드 한 파일의 타입이 이미지이면(jpg,png,gif) img 태그를 사용해서 웹브라우저에 이미지 출력
				
				// 원화표시(\) -> / 로 바꿔서 경로가 제대로 뜨게 만들기(uuid도 포함)
				var fileCallPath = encodeURIComponent(obj.uploadPath + "/" + obj.uuid + "_" + obj.fileName)
				console.log(fileCallPath); // 콘솔 확인
				
				// img 태그를 사용해서 웹브라우저에 이미지 출력
				str += "<li data-path='" + obj.uploadPath + "' data-uuid='" + obj.uuid
				str += "' data-name='" + obj.fileName + "' data-type='" + obj.image + "'>"
				str += "<img src='/display?fileName=" + fileCallPath + "'></li>"
			}
			$("#uploadResult ul").html(str);
		
		})
	})
	

	//------------------------------
	// showList() 호출
	showList();
	//------------------------------
	function showList(){
		// getList 호출
		replyService.getList({bno:bno},function(list){
			console.log(list);
			var str="";
			
			for(var i=0; i<list.length; i++){
	
				str += "<li><div><input type='hidden' class='detail_rno' name='rno' value='"+ list[i].rno + "' readonly></div>" +"<div><b>" + list[i].replyer + "</b>"
				str += "<input type='text' data-rno='" + list[i].rno + "' name='replydate' value='" + list[i].replydate +"' class='detail_replydate' readonly></div>"
				str += "<div><textarea data-rno='" + list[i].rno + "' name='content' id='content' rows='2" +
						"' cols='50' readonly>" + list[i].reply+ "</textarea></div>"

				str += "<div class='r_btns'><ul><li><input type='submit' name='r_delete_btn' class='r_delete_btn' value='삭제'></li>"
				str += "<li><input id='r_modify" + list[i].rno + "' data-rno='" + list[i].rno + "' type='submit' class='r_modify_btn' value='수정'></li>"
				str += "<li><input id='r_submit" + list[i].rno + "' data-rno='" + list[i].rno + "' type='submit' name='modBtn' class='r_submit_btn' value='등록'></li>"
				str += "<ul></div></li>"
					
//				str += "<li><div><input type='text' name='rno' value='"+ list[i].rno + "'></div>" +"<div><b>" + list[i].replyer + "</b></div>"
//				str += "<div><textarea data-rno='" + list[i].rno + "' name='content' id='content' rows='8' cols='50' readonly>" + list[i].reply + "</textarea></div><div><input data-rno='" + list[i].rno + "' type='submit' class='r_modify_btn' value='수정'><input type='submit' name='modBtn' class='r_submit_btn' value='등록'></div>"
//				str += "</li>"
			}

			$("#relist").html(str);
			
			$(".r_submit_btn").hide();
			
			
			
			
		});
	}// function showList() 끝
	

	//------------------------------
	$("#d_reply_regBtn").on("click", function(){
		//alert("aaa");
		

		
		// 사용자가 입력한 댓글 내용을 변수에 저장
		var reply = $("textarea[name='reply']").val();
		// 사용자가 입력한 댓글작성자를 변수에 저장
		var replyer = $("input[name='replyer']").val();
		
		replyService.add({reply:reply, replyer:replyer, bno: bno}, 
				function(result){
					//alert("insert 작업 : " + result)
					alert("댓글을 작성했습니다.");
					
					// 입력한 값 초기화
					$("textarea[name='reply']").val("");
					// $("input[name='replyer']").val("");
					
					// 댓글 목록 보여주기
					showList();
		});



	})// $("#d_reply_regBtn").on("click", function() 끝
	
	$("#d_reply_regBtn2").on("click", function(){
		alert("로그인 후 댓글 작성이 가능합니다.");
	})
	
	
	//------------------------------
	
	// 댓글에 수정 버튼을 클릭하면
	$("#relist").on("click",".r_modify_btn",function(){
		

		var rno = $(this).data("rno");
		
		
		
		// 내가 선택한 #r_modify를 숨기고
		$("input[id='r_modify" + rno + "']").hide();
		
		// 내가 선택한 #r_submit을 보여준다
		$("input[id='r_submit" + rno + "']").show();
		
		replyService.reDetail(rno, function(){
			$("textarea[data-rno='" + rno + "']").removeAttr("readonly");
			$("textarea[data-rno='" + rno + "']").css("border","1px solid #ccc");
			

		});
		
	})
	// 댓글에 등록 버튼을 클릭하면
	$("#relist").on("click",".r_submit_btn",function(){
		//alert("aaa");
		$(".r_submit_btn").hide();
		$(".r_modify_btn").show();
	
		
		var rno = $(this).data("rno");
		console.log(rno);
		var reply = {rno:$("input[value='" + rno + "']").val(), reply:$("textarea[data-rno='" + rno + "']").val()};
		console.log(reply);
		
		replyService.reUpdate(reply, function(update){
			// callback 영역(update가 정상적으로 처리된 후 조치)
			//alert("update 작업 : " + update);
			
			showList();
			
			$(".r_submit_btn").hide();
		});
		
		

	})
	
	// 댓글 삭제 버튼을 클릭하면
	$("#relist").on("click",".r_delete_btn",function(){
		
		var reply = {rno:$("input[name='rno']").val()};
		

		replyService.remove(reply, function(remove){
			// callback 영역(delete가 정상적으로 처리된 후 조치)
			
			//alert("delete 작업 : " + remove);
			alert("댓글을 삭제합니다.")
			
			showList();
		})

	})
	
	
	
	

})// document 끝

// replyService(익명함수) 선언
var replyService=(function(){
	// 댓글 쓰기를 하기 위한 함수 선언
	function add(reply, callback){
		console.log("reply....");
		$.ajax({
			url: "/replies/new",
			type: "post",
			data: JSON.stringify(reply),
			contentType: "application/json ; charset=utf-8",
			success: function(result){
				console.log(result);
				
				if(callback)
					callback(result);
			},
			error: function(){
				
			}
		})
	}
	
	// 댓글 목록 리스트를 하기 위한 함수 선언
	function getList(param, callback){
		var bno=param.bno;
		console.log(bno);
		
		$.getJSON(
			"/replies/list/" + bno + ".json",
			function(data){
				if(callback)
					callback(data);
		})
	}
	// 댓글 수정을 하기 위해서, 댓글 내용 가져오기 함수 선언
	function reDetail(rno, callback){
		var rno = rno;
		$.getJSON(
			"/replies/" + rno + ".json",
			function(data){
				if(callback)
					callback(data);
		})
	}
	
	// 댓글 수정을 하기 위한 함수 선언
	function reUpdate(reply, callback){
		$.ajax({
			url: "/replies/update",
			type: "put",
			data: JSON.stringify(reply),
			contentType: "application/json ; charset=utf-8",
			success: function(result){
				console.log(result);
				
				if(callback)
					callback(result);
			},
			error: function(){
				
			}
		})
	}
	 
	// 댓글 삭제를 하기 위한 함수 선언
	function remove(reply, callback){
		$.ajax({
			url: "/replies/remove",
			type: "delete",
			data: JSON.stringify(reply),
			contentType: "application/json ; charset=utf-8",
			success: function(result){
				console.log(result);
				
				if(callback)
					callback(result); // 고유명사 callback;
				
			},
			error: function(){
				
			}
		})
	}
	return {add:add,
			getList:getList,
			reDetail:reDetail,
			reUpdate:reUpdate,
			remove:remove
	};
})()
