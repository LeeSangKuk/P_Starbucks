function joinFormCheck() {//joinFormCheck 함수로 유효성 검사
  
};

window.onload = function(){

	//변수에 담아주기
	const userId = document.getElementById("userId");
	const userPw = document.getElementById("userPw");
	const userPwCheck = document.getElementById("userPwCheck");
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
	
	//정규식
	const idReg = /^[a-z0-9]{4,20}$/;
	const pwReg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;
	
	//토큰
	var idToken = false
	var pwToken = false
	var emailToken = false
	var phoneToken = false
	console.log("최초실행");
	
	//유효성검사 함수
	userId.onkeyup = () => {
		  console.log("실행");
		  if(!idReg.test(userId.value)){
			  idError.innerText = "아이디는 영 소문자, 숫자 4~20자리로 입력해주세요."
			  idError.style.color = 'red'
			  idToken = false;
		  }
		  else{
		      const idE = idError
		      idE.innerText = '올바른 아이디입니다.'
		      idE.style.color = 'green'
		      idToken = true;
		  }
	}
	
	userPw.onkeyup = () => {
		  if(!pwReg.test(userPw.value)){
			  pwError.innerText = "비밀번호는 영문자+숫자+특수문자 조합으로 8~16자리 사용해야 합니다."
			  pwError.style.color = 'red'
			  pwToken = false;
		  }
		  else{
		      const pwE = pwError
		      pwE.innerText = '올바른 비밀번호입니다.'
		      pwE.style.color = 'green'
		      pwToken = true;
		  }
	}
	
	userPwCheck.onkeyup = () => {
		  if(userPwCheck.value !== userPw.value){
			  pwCkError.innerText = "입력하신 비밀번호와 맞지 않습니다."
			  pwCkError.style.color = 'red'
			  pwToken = false;
		  }
		  else{
		      const pwCkE = pwCkError
			  pwCkE.innerText = '입력하신 비밀번호와 일치합니다.'
			  pwCkE.style.color = 'green'
			  pwToken = true;
		  }
	}
	
	//비밀번호 영문자+숫자+특수조합(8~16자리 입력) 정규식
	//var pwCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;
	//
	//if (!pwCheck.test(userPw.value)) {
	//  alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~16자리 사용해야 합니다.");
	//  userPw.focus();
	//  return false;
	//};
	//
	//if (userPwCheck.value !== userPw.value) {
	//  alert("비밀번호가 일치하지 않습니다..");
	//  userPwCheck.focus();
	//  return false;
	//};
	//
	//if (userName.value == "") {
	//  alert("이름을 입력하세요.");
	//  userName.focus();
	//  return false;
	//};
	//
	//var reg = /^[0-9]+/g; //숫자만 입력하는 정규식
	//
	//if (!reg.test(userPhone.value)) {
	//  alert("전화번호는 숫자만 입력할 수 있습니다.");
	//  userPhone.focus();
	//  return false;
	//};
	//
	//if (userGender.value == "") { //둘다 미체크시
	//	  alert("성별을 선택해 주세요.");
	//	  return false;
	//};
	//
	//if (userBirthYear.value == "" || userBirthMonth.value == "" || userBirthDay.value == "" || userBirthFlag.value == "") {
	//	    alert("생년월일을 선택하세요.");
	//	    return false;
	//};
	//
	//if (userEmail.value == "") {
	//  alert("이메일 주소를 입력하세요.");
	//  userEmail.focus();
	//  return false;
	//};
	//
	function Welcome(){
	
	    if(!idToken) {
	        alert("아이디 형식을 확인하세요.");
	        return;
	    }
	    
	    if(!pwToken) {
	  	  alert("비밀번호 형식을 확인하세요.");
	  	  return;
	    }
	    
	    if(!pwCkToken) {
	  	  alert("비밀번호가 일치한지 확인하세요");
	  	  return;
	    }
	
	//    if(!emailToken){
	//        alert("이메일 형식을 확인하세요.");
	//        return;
	//    }
	//
	//    if(!phoneToken){
	//        alert("휴대폰 형식을 확인하세요.");
	//        return;
	//    }
	
	    alert("가입을 환영합니다!");
	}
}