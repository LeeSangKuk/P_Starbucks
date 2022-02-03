function joinFormCheck() {//joinFormCheck 함수로 유효성 검사
  //변수에 담아주기
  var userId = document.getElementById("userId");
  var userPw = document.getElementById("userPw");
  var userPwCheck = document.getElementById("userPwCheck");
  var userName = document.getElementById("userName");
  var female = document.getElementById("female");
  var male = document.getElementById("male");
  var userPhone = document.getElementById("userPhone");
  var userEmail = document.getElementById("userEmail");
//  var agree = document.getElementById("agree");

  if (userId.value == "") { //해당 입력값이 없을 경우 같은말: if(!userId.value)
    alert("아이디를 입력하세요.");
    userId.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
  };

  if (userPw.value == "") {
    alert("비밀번호를 입력하세요.");
    userPw.focus();
    return false;
  };

  //비밀번호 영문자+숫자+특수조합(8~16자리 입력) 정규식
  var pwCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/;

  if (!pwCheck.test(userPw.value)) {
    alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~16자리 사용해야 합니다.");
    userPw.focus();
    return false;
  };

  if (userPwCheck.value !== userPw.value) {
    alert("비밀번호가 일치하지 않습니다..");
    userPwCheck.focus();
    return false;
  };

  if (userName.value == "") {
    alert("이름을 입력하세요.");
    userName.focus();
    return false;
  };
  
  if (!userBirthYear.checked || !userBirthMonth.checked || !userBirthDay.checked) {
    alert("생년월일을 선택하세요.");
    return false;
  };
  
  if (!female.checked && !male.checked) { //둘다 미체크시
    alert("성별을 선택해 주세요.");
    female.focus();
    return false;
  };

  var reg = /^[0-9]+/g; //숫자만 입력하는 정규식

  if (!reg.test(userPhone.value)) {
    alert("전화번호는 숫자만 입력할 수 있습니다.");
    userPhone.focus();
    return false;
  };

  if (userEmail.value == "") {
    alert("이메일 주소를 입력하세요.");
    userEmail.focus();
    return false;
  };

//  if (!agree.checked) { //체크박스 미체크시
//    alert("약관 동의를 체크하세요.");
//    agree.focus();
//    return false;
//  }

  //입력 값 전송
  document.joinForm.submit(); //유효성 검사의 포인트   
  
};