var userId = document.getElementById("userId");
var userPw = document.getElementById("userPw");

var loginError = document.getElementById("loginError");

const idReg = /^[a-z0-9]{4,20}$/;
const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;

//토큰
var idToken = false;
var pwToken = false;

window.onload = function(){
	//아이디 유효성검사
	userId.onblur = () => {
		  if(!idReg.test(userId.value)){
			  idToken = false;
			  console.log('id 실패')
		  }
		  else{
		      idToken = true;
		      console.log('id 성공')
		  }
	}
	
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
    if(!idToken || !pwToken) {
    	console.log(loginError);
    	loginError.innerText = "회원정보를 다시 확인해주세요.";
    	loginError.style.color = 'red';
        return false;
    }else{
    	return true;
    }
}
