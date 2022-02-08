//input id값을 변수에 담아주기
var userId = document.getElementById("userId");
var userPw = document.getElementById("userPw");
var userPwCheck = document.getElementById("userPwCheck");
var userName = document.getElementById("userName");
var userGender = document.getElementById("userGender");
var userBirthYear = document.getElementById("userBirthYear");
var userBirthMonth = document.getElementById("userBirthMonth");
var userBirthDay = document.getElementById("userBirthDay");
var userBirthFlag = document.getElementById("userBirthFlag");
var userPhone = document.getElementById("userPhone");
var userEmail = document.getElementById("userEmail");
var joinForm = document.getElementById("joinForm");

//에러메시지 변수
var idError = document.getElementById("idError");
var pwError = document.getElementById("pwError");
var nameError = document.getElementById("nameError");
var genderError = document.getElementById("genderError");
var	birthError = document.getElementById("birthError");
var phoneError = document.getElementById("phoneError");
var emailError = document.getElementById("emailError");

//정규식
const idReg = /^[a-z0-9]{4,20}$/;
const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;
const nameReg = /^[가-힣a-zA-Z]+$/;
const phoneReg = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/;
const emailReg = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
const emailReg2 = /[ㄱ-ㅎ가-힣]/g;

//토큰
var idToken = false
var pwToken = false
var nameToken = false
var genderToken = false
var birthToken = false
var phoneToken = false
var emailToken = false

window.onload = function(){ //페이지가 열린 즉시 실행되는 함수
	
	//아이디 유효성검사
	userId.onblur = () => {
		  if(!idReg.test(userId.value)){
			  idError.innerText = "아이디는 영 소문자, 숫자 4~20자리로 입력해주세요."
			  idError.style.color = 'red'
			  idToken = false;
			  console.log('id 실패')
		  }
		  else{
		      const idE = idError
		      idE.innerText = '올바른 아이디입니다.'
		      idE.style.color = 'green'
		      idToken = true;
		      console.log('id 성공')
		  }
	}
	
	//비밀번호 유효성검사
	userPw.onblur = () => {
		  if(!pwReg.test(userPw.value)){
			  pwError.innerText = "비밀번호는 영문자+숫자+특수문자 조합으로 8~16자리 사용해야 합니다."
			  pwError.style.color = 'red'
			  pwToken = false;
			  console.log('pw 실패')
		  }
		  else{
		      const pwE = pwError
		      pwE.innerText = '올바른 비밀번호입니다.'
		      pwE.style.color = 'green'
		      pwToken = true;
		      console.log('pw 성공')
		  }
	}
	
	//비밀번호재확인 유효성검사
	userPwCheck.onblur = () => {
		  if(userPwCheck.value !== userPw.value){
			  pwCkError.innerText = "입력하신 비밀번호와 맞지 않습니다."
			  pwCkError.style.color = 'red'
			  pwToken = false;
			  console.log('pwCk 실패')
		  }
		  else{
		      const pwCkE = pwCkError
			  pwCkE.innerText = '입력하신 비밀번호와 일치합니다.'
			  pwCkE.style.color = 'green'
			  pwToken = true;
		      console.log('pwCk 성공')
		  }
	}
	
	//이름 유효성검사
	userName.onblur = () => {
		if(!nameReg.test(userName.value)){
			nameError.innerText = "한글과 영문 대 소문자를 사용하세요. (특수기호, 공백 사용 불가)"
			nameError.style.color = 'red'
			nameToken = false;
			console.log('name 실패')
		}
		else{
			const nameE = nameError
			nameE.innerText = '멋진 이름이네요!'
			nameE.style.color = 'green'
			nameToken = true;
			console.log('name 성공')
		}
	}
	
	//성별 유효성검사
	userGender.onchange = () => {
		if(userGender.value == ''){
			genderError.innerText = '필수 정보입니다.'
			genderError.style.color = 'red'
			genderToken = false;
			console.log('gender 실패')
		}
		else{
			genderError.innerText = ''
			gederToken = true;
			console.log('gender 성공')
		}
	}
	
	//생년월일 유효성검사
	//년
	userBirthYear.onchange = () => {
		if(userBirthYear.value == ''){
			birthError.innerText = '필수 정보입니다.'
			birthError.style.color = 'red'
			birthToken = false;
			console.log('year 실패')
		}
		else{
			birthError.innerText = ''
			birthToken = true;
			console.log('year 성공')
		}
	}
	
	//월
	userBirthMonth.onchange = () => {
		if(userBirthMonth.value == ''){
			birthError.innerText = '필수 정보입니다.'
			birthError.style.color = 'red'
			birthToken = false;
			console.log('month 실패')
		}
		else{
			birthError.innerText = ''
				birthToken = true;
			console.log('month 성공')
		}
	}
	
	//일
	userBirthDay.onchange = () => {
		if(userBirthDay.value == ''){
			birthError.innerText = '필수 정보입니다.'
			birthError.style.color = 'red'
			birthToken = false;
			console.log('day 실패')
		}
		else{
			birthError.innerText = ''
			birthToken = true;
			console.log('day 성공')
		}
	}
	
	//양/음력
	userBirthFlag.onchange = () => {
		if(userBirthFlag.value == ''){
			birthError.innerText = '필수 정보입니다.'
			birthError.style.color = 'red'
			birthToken = false;
			console.log('flag 실패')
		}
		else{
			birthError.innerText = ''
			birthToken = true;
			console.log('flag 성공')
		}
	}
	
	//핸드폰 유효성검사
	userPhone.onblur = () => {
		if(userPhone.value == ''){
			phoneError.innerText = '필수 정보입니다.'
			phoneError.style.color = 'red'
			phoneToken = false;
			console.log('phone 실패')
		}
		else if(!phoneReg.test(userPhone.value)){
			phoneError.innerText = '형식에 맞지 않는 번호입니다.'
			phoneError.style.color = 'red'
			phoneToken = false;
			console.log('phone 형식 실패')
		}
		else{
			phoneError.innerText = ''
			phoneToken = true;
			console.log('phone 성공')
		}
	}
	
	//이메일 유효성검사
	userEmail.onblur = () => {
		if(userEmail.value == ''){
			emailError.innerText = '필수 정보입니다.'
			emailError.style.color = 'red'
			emailToken = false;
			console.log('email 실패')
		}
		else if(!emailReg.test(userEmail.value) || emailReg2.test(userEmail.value)){
			alert(userEmail.value);
			emailError.innerText = '형식에 맞지 않는 이메일입니다.'
			emailError.style.color = 'red'
			emailToken = false;
			console.log('email 형식 실패')
		}
		else{
			const emailE = emailError
			emailE.innerText = ''
			emailToken = true;
			console.log('email 성공')
		}
	}	
}

//최종 전체 유효성 검사 후 회원가입 완료 안내
function Welcome(){
    if(!idToken) {
        alert("아이디 형식을 확인하세요.");
        return false;
    }
    else if(!pwToken) {
  	  alert("비밀번호 형식을 확인하세요.");
  	  	return false;
    }
    else if(!pwCkToken) {
  	  alert("비밀번호가 일치한지 확인하세요.");
  	  	return false;
    }
    else if(!nameToken) {
    	alert("이름 형식을 확인하세요.");
    	return false;
    }
    else if(!genderToken) {
    	alert("성별을 선택했는지 확인하세요.");
    	return false;
    }
    else if(!birthToken) {
    	alert("생년월일을 올바르게 선택했는지 확인하세요.");
    	return false;
    }
    else if(!emailToken){
	    alert("이메일 형식을 확인하세요.");
	    return false;
	}
    else if(!phoneToken){
	    alert("휴대폰 형식을 확인하세요.");
	    return false;
	}else{
		return true;
	}
	
}

