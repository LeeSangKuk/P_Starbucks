var userId = document.getElementById("userId");
var userPw = document.getElementById("userPw");

var loginError = document.getElementById("loginError");

const idReg =  /^[a-z]+[a-z0-9]{5,19}$/g;
const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;

//토큰
var idToken = false;
var pwToken = false;

//1. 쿠키 저장하기 함수---------------------------------------------------------------------------------------------------
function setCookie(cookie_name, value, days) {
var exdate = new Date(); //생성자 호출
exdate.setDate(exdate.getDate() + days); //현지시간기준(현지시간의 일+days)

//설정 일수만큼 현재시간에 만료값으로 지정
var cookie_value = escape(value) + ((days == null) ? '' : ';    expires=' + exdate.toUTCString());
 //value값을 16진수 이스케이프 시퀀스로 대체 + 현지시간의 일 == null 이면 공백 ,아니면 '; expires=현재날짜를 협정세계시로 출력
/* escape [함수] 특정 문자가 16진수 이스케이프 시퀀스로 대체된 새 문자열을 계산 */
document.cookie = cookie_name + '=' + cookie_value; // 쿠키이름 = 쿠키 값

}

/*
* split [함수] String 객체를 지정한 구분자를 이용하여 여러 개의 문자열로 나눔
* substring() [메서드] string 객체의 시작 인덱스로 부터 종료 인덱스 전 까지 문자열의 부분 문자열을 반환
* indexOf() [메서드] 호출한 String 객체에서 주어진 값과 일치하는 첫 번째 인덱스를 반환, 일치하는 값이 없으면 -1을 반환
* replace() [메서드] 어떤 패턴에 일치하는 일부 또는 모든 부분이 교체된 새로운 문자열을 반환. 
* 				그 패턴은 문자열이나 정규식(RegExp)이 될 수 있으며, 교체 문자열은 문자열이나 모든 매치에 대해서 호출된 함수일 수 있음.
* */

//2. 쿠키 얻어오기 함수---------------------------------------------------------------------------------------------------
function getCookie(cookie_name) {
	
// 변수 선언
var x, y; 
var val = document.cookie.split(';'); // 쿠키를 문자열로 출력

	for (var i = 0; i < val.length; i++) { 
	  x = val[i].substr(0, val[i].indexOf('='));
	  y = val[i].substr(val[i].indexOf('=') + 1);
	  x = x.replace(/^\s+|\s+$/g, ''); // 앞과 뒤의 공백 제거하기
	  
	  if (x == cookie_name) {
	    return unescape(y); // unescape로 디코딩 후 값 리턴
	  }
	  
	}

}

window.onload = function(){
	var id = getCookie("c_userid");

	//typeof 피연산자의 유형을 나타내는 문자열을 반환
	if (id == null || typeof id == "undefined") {
	 id = "";
	}
	document.getElementById("userId").value = id; //id값이 "id"인 입력란의 값을 저장
	
	if(id != ''){
		document.getElementById("saveId").checked=true;
	}
	
	
	//아이디 유효성검사
	$.ajax({
	    url:'checkId', //Controller에서 인식할 주소
	    type:'post', //POST 방식으로 전달
	    data: {'userId':id},
	    dataType:"json",
	    success:function(cnt){ //컨트롤러에서 넘어온 cnt값을 받는다 
	    	console.log('ajax:'+id);
	        if(cnt == 0 || !idReg.test(userId.value)){ //cnt가 0이 아니면 -> 사용 가능한 아이디 
			      idToken = false;
			      console.log('id 존재x')
	        }
	        else if(cnt == 1){
				  idToken = true;
				  console.log('id 성공')
	        }
	        else{
	        	
	        }
	        console.log('cnt : '+cnt);
	    },
	    error:function(){
	        alert("에러입니다");
	    }
	})

	
	//비밀번호 유효성검사
	userPw.onblur = () => {
		  if(!pwReg.test(userPw.value)){
			  pwToken = false;
			  console.log('pw 실패')
		  }
		  else{
		      pwToken = true;
		      console.log('pw 성공')
		  }
	}
	
}

function Welcome(){
	console.log(idToken);
	console.log(pwToken);
    if(!idToken || !pwToken) {
    	console.log(loginError);
    	loginError.innerText = "입력하신 아이디 또는 비밀번호를 다시 확인해주세요.";
    	loginError.style.color = 'red';
        return false; 
    }
    else{
    	return true;
    }
}
