$(document).ready(function(){
    
	//버튼을 클릭하면 클릭 후 액션은 사라지고 ajax -> db에서 아이디와 비밀번호가 일치한지 확인 후 결과값을 도출
	$("#submit").click(function(e){
        e.preventDefault();
        
        let userId = $('#userId').val();
        let userPwd = $('#userPw').val();

        $.ajax({
            url: 'postLogin',
            data: {
                "userId": userId,
                "userPw": userPwd
            },
            type: "POST",
            dataType: "json",
            success: function(data){ //컨트롤러에서 넘어온 data
            	
            	console.log("ajax: "+data);
		        if(data == 1){
		        	let url = "/main";
		        	location.replace(url); 
		        } 
		        else{
		        	$("#loginError").text("아이디 또는 비밀번호가 일치하지 않습니다.");
		        	$("#loginError").css("color","red");
		        }	
	        },
	        error:function(){
	        	console.log("ajax: "+data);
		        alert("에러입니다");
		    }
        });
    });

	// 아이디저장
	// 저장된 쿠키값을 가져와서 ID 칸에 넣어준다. 없으면 공백으로 들어감.
    var key = getCookie("key");
    $("#userId").val(key); 
     
    // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,
    if($("#userId").val() != ""){ 
        $("#saveId").attr("checked", true); // ID 저장하기를 체크 상태로 두기.
    }
     
    $("#saveId").change(function(){ // 체크박스에 변화가 있다면,
        if($("#saveId").is(":checked")){ // ID 저장하기 체크했을 때,
            setCookie("key", $("#userId").val(), 7); // 7일 동안 쿠키 보관
        }else{ // ID 저장하기 체크 해제 시,
            deleteCookie("key");
        }
    });
     
    // ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.
    $("#userId").keyup(function(){ // ID 입력 칸에 ID를 입력할 때,
        if($("#saveId").is(":checked")){ // ID 저장하기를 체크한 상태라면,
            setCookie("key", $("#id").val(), 7); // 7일 동안 쿠키 보관
        }
    });

});

/* escape [함수] 특정 문자를 제외하고 16진수로 변환 (쿠키문자열과 충돌을 피하기위해 사용)*/

//쿠키 저장 (saveid함수에서 넘겨준 시간이 현재시간과 비교해서 쿠키를 생성하고 지워준다)
function setCookie(cookieName, value, exdays) {// 쿠키이름,쿠키값,설정일수
	var exdate = new Date();//생성자 호출
	exdate.setDate(exdate.getDate() + exdays);//현지시간의 일+설정일수로 설정
	
	//쿠키값을 16진수로 변환 + 현지시간의 일 == null 이면? "" ,아니면 : "; expires="+현재날짜를 협정세계시로 출력
	var cookieValue = escape(value) + ((exdays == null) ? "" : "; expires=" + exdate.toGMTString());
	
	document.cookie = cookieName + "=" + cookieValue;// 쿠키이름 = 쿠키 값
}

/*
 * expireDate:쿠키가 만료되는 날짜와 시간을 가져옴.
 * */

//쿠키 삭제 (해당이름의 쿠키를 삭제한다)
function deleteCookie(cookieName) {
	var expireDate = new Date();
	
	//어제 날짜를 쿠키 소멸 날짜로 설정한다.
	expireDate.setDate(expireDate.getDate() - 1)
	
	document.cookie = cookieName + "= " + "; expires="
			+ expireDate.toGMTString();
}

/*
* split [함수] String 객체를 지정한 구분자를 이용하여 여러 개의 문자열로 나눔
* substring() [메서드] string 객체의 시작 인덱스로 부터 종료 인덱스 전 까지 문자열의 부분 문자열을 반환
* indexOf() [메서드] 호출한 String 객체에서 주어진 값과 일치하는 첫 번째 인덱스를 반환, 일치하는 값이 없으면 -1을 반환
* replace() [메서드] 어떤 패턴에 일치하는 일부 또는 모든 부분이 교체된 새로운 문자열을 반환. 
* 				그 패턴은 문자열이나 정규식(RegExp)이 될 수 있으며, 교체 문자열은 문자열이나 모든 매치에 대해서 호출된 함수일 수 있음.
* */

//쿠키 가져오기 (해당이름의 쿠키를 가져온다)
function getCookie(cookieName) {
	cookieName = cookieName + '=';
	
	var cookieData = document.cookie; // http 쿠키에 접근한다
	var start = cookieData.indexOf(cookieName); //해당이름의 쿠키 인덱스를 반환하라 
	console.log("start(시작지점) : "+start)
	var cookieValue = '';
	
	if (start != -1) { // 쿠키가 존재하면
		start += cookieName.length; // 해당이름의 쿠키 길이만큼 대입한다 
		console.log(cookieName.length)
		console.log("start(끝지점) : "+cookieData)
		
		var end = cookieData.indexOf(';', start); // 접근한 쿠키에서 구분자(;)를 찾아 인덱스로 반환하라
		
		if (end == -1) //쿠키 값의 마지막 위치 인덱스 번호 설정 
			end = cookieData.length;
         console.log("end위치  : " + end);
		cookieValue = cookieData.substring(start, end);
	}
	return unescape(cookieValue); // 16진수로 변환시킨 쿠키값을 원상복귀
}
