$(function() { // 4.페이지를 실행할 때 실행하도록 기본실행함수 실행
         
    fnInit();
  
});

function login(){ // 1.saveid 함수 실행
  saveid();
}

function fnInit(){ 
 var cookieid = getCookie("saveid");
 console.log(cookieid);//getCookie(name)함수에 'saveid'를 넣어
 if(cookieid !=""){ //getCookie(name)값이 비어있지않다면
     $("input:checkbox[id='saveId']").prop("checked", true); // 아이디값의 이름이 saveid 체크박스에 체크하고
     $('#logId').val(cookieid); //logId의 아이디 값에 getCookie(name)값 넣어준다
 }
 
}  

//3. saveid함수에서 넘겨준 시간이 현재시간과 비교해서 쿠키를 생성하고 지워주는 함수
function setCookie(name, value, expiredays) {
 var todayDate = new Date();
 todayDate.setTime(todayDate.getTime() + 0);
 if(todayDate > expiredays){ // 현재시간보다 크다면 한달치 시간을 넣어 쿠키를 생성
     document.cookie = name + "=" + escape(value) + "; path=/; expires=" + expiredays + ";";
 }else if(todayDate < expiredays){ // 현재시간보다 작다면 마이너스 값을 넣어 쿠키 삭제
     todayDate.setDate(todayDate.getDate() + expiredays);
     document.cookie = name + "=" + escape(value) + "; path=/; expires=" + todayDate.toGMTString() + ";";
 }
 
 
 console.log(document.cookie);
}

function getCookie(Name) {
 var search = Name + "=";
 console.log("search : " + search);
 
 if (document.cookie.length > 0) { // 쿠키가 설정되어 있다면 
     offset = document.cookie.indexOf(search);
     console.log("offset : " + offset);
     if (offset != -1) { // 쿠키가 존재하면 
         offset += search.length;
         // set index of beginning of value
         end = document.cookie.indexOf(";", offset);
         console.log("end : " + end);
         // 쿠키 값의 마지막 위치 인덱스 번호 설정 
         if (end == -1)
             end = document.cookie.length;
         console.log("end위치  : " + end);
         
         return unescape(document.cookie.substring(offset, end));
     }
 }
 return "";
}

// 2.체크박스에 체크값에 대하여 조건에 따라 시간을 구해주는 함수
function saveid() { 
 var expdate = new Date();
 if ($("#saveId").is(":checked")){
     expdate.setTime(expdate.getTime() + 1000 * 3600 * 24 * 30); // 현재시간에 한달 +
     setCookie("saveid", $("#logId").val(), expdate);
     }else{
    expdate.setTime(expdate.getTime() - 1000 * 3600 * 24 * 30); // 현재시간에 한달 - (마이너스 하게되면 쿠키값 존재 x)
     setCookie("saveid", $("#logId").val(), expdate);
      
 }
}


