<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="../resources/css/header&footer.css">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.15/jquery.bxslider.min.css" rel="stylesheet" />
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.15/jquery.bxslider.min.js"></script>
		<script src="../resources/js/bxslider.js"></script>
		<script src="../resources/js/header.js"></script>
		<script src="../resources/js/search.js"></script>

    <title>Document</title>
</head>
<body>
    <div id="wrap">
    	<div class=header_wrap>
	        <header id="header">
	            <div class="header_in">
	                <h1 class="logo">
	                    <a href="/main">스타벅스 </a>
	                </h1>
	                
	                <nav class="pc-gnb">
	                    <ul>
	                        <li>
	                            <a href="#">브랜드 소개</a>
	                        </li>
	                        <li>
	                            <a href="/menu">모든 메뉴</a>
	                        </li>
	                        <li>
	                            <a href="#">리워드</a>
	                        </li>
	                        <li>
	                            <a href="#">이벤트</a>
	                        </li>
	                        <li>
	                            <a href="#">매장찾기</a>
	                        </li>
	                    </ul>
	                </nav><!--.gnb-->
	    
	                <div class="pc-util">
	                    <ul>
	                        <li>
	                        	<c:choose>
	                        		<c:when test="${login!=null}">
	                        			<div><a href="/member/logout" id="logout" >로그아웃</a></div>
	                        			<!-- <div><a href="/member/logout" id="logout" >${login.userId}님 환영합니다.</a></div> -->
	                        		</c:when>
	                        		<c:otherwise>
	                        			<div><a href="/member/login">로그인</a></div>
	                        		</c:otherwise>                   	
	                        	</c:choose>
	
	                        </li>
	                        <li> 
	                            <c:choose>
	                        		<c:when test="${login!=null}">
	                        			<a href="#">나의 스타벅스</a>
	                        		</c:when>
	                        		<c:otherwise>
	                        			<a href="/member/login">나의 스타벅스</a>
	                        		</c:otherwise>                   	
	                        	</c:choose>
	                        </li>
	                        <li>
	                            <a href="/info">고객센터</a>
	                        </li>
	                    </ul>
	                </div><!--.pc-util-->
	                
	                <div class="icons">
	                    <ul>
	                        <li class="icon_search">
	                            <a href="#">통합검색</a>
	                        </li>
	                        <li class="icon_menu">
	                            <a href="#"> 전체메뉴 </a>
	                        </li>
	                    </ul>
	                </div><!--.icons-->
	            </div><!--.header_in-->

	        	</header><!--#header-->
	         <div class="header_search">
                <div class="header_search_in">
                    <div class="h_search_top">
                        <input type="text" placeholder="찾고 싶은 내용을 입력해주세요.">
                        <p class="h_search_btn"><a href="#">검색</a></p>
                        <p class="h_search_close"><a href="#">닫기</a></p>
                    </div>
                </div>
             </div>
	       	 </div><!-- .header_wrap -->
             
             
            
            <!-- 전체 메뉴 버튼-->
           	<div class="search_bg"></div>
			<div class="menu_bg"></div>
			
			<div class="sidebar_menu">
			    <div class="close_btn"><a href="#">       
			        <img src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIyNCIgaGVpZ2h0PSIyNCIgdmlld0JveD0iMCAwIDI0IDI0Ij48cGF0aCBkPSJNMjMuOTU0IDIxLjAzbC05LjE4NC05LjA5NSA5LjA5Mi05LjE3NC0yLjgzMi0yLjgwNy05LjA5IDkuMTc5LTkuMTc2LTkuMDg4LTIuODEgMi44MSA5LjE4NiA5LjEwNS05LjA5NSA5LjE4NCAyLjgxIDIuODEgOS4xMTItOS4xOTIgOS4xOCA5LjF6Ii8+PC9zdmc+">
			        </a>
			    </div>
			    <div class="menu_wrap">
			        <ul>
			            <li class="menu_title"><a href="#">브랜드 소개</a></li>
			            <li><a href="#">스타벅스 코리아</a></li>
			            <li><a href="#">스타벅스 이야기</a></li>
			            <li><a href="#">국내 뉴스룸</a></li>
			            <li><a href="#">세계의 스타벅스</a></li>
			        </ul>
			
			        <ul>
			            <li class="menu_title"><a href="#">모든 메뉴</a></li>
			            <li><a href="#">음료</a></li>
			            <li><a href="#">푸드</a></li>
			            <li><a href="#">상품</a></li>
			            <li><a href="#">카드</a></li>
			        </ul>
			
			        <ul>
			            <li class="menu_title"><a href="#">리워드</a></li>
			            <li><a href="#">스타벅스 리워드</a></li>
			            <li><a href="#">스타벅스 카드</a></li>
			            <li><a href="#">스타벅스 e-Gift Card</a></li>
			        </ul>
			
			        <ul>
			            <li class="menu_title"><a href="#">이벤트</a></li>
			            <li><a href="#">스타벅스 카드</a></li>
			            <li><a href="#">스타벅스 리워드</a></li>
			            <li><a href="#">매장별 이벤트</a></li>
			        </ul>
			
			        <ul class="menu_titles">
			            <li class="menu_title"><a href="#">매장 찾기</a></li>
			            <li class="menu_title"><a href="#">공지사항</a></li>
			            <li class="menu_title"><a href="#">월페이퍼</a></li>
			        </ul>
			    </div><!--.menu_wrap-->
			</div><!--sidebar_menu-->
