<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="../resources/css/header&footer.css">
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>Document</title>
</head>
<body>
    <div id="wrap">
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
		                    <c:if test="${login!=null}">
								<div><a href="/member/login">로그아웃</a></div>
							</c:if>
                        </li>
                        <li>
                            <a href="/member/login">나의 스타벅스</a>
                        </li>
                        <li>
                            <a href="/info">고객센터</a>
                        </li>
                    </ul>
                </div><!--.pc-util-->
                
                <div class="icons">
                    <ul>
                        <li class="icon_search">
                            <a href="">통합검색</a>
                        </li>
                        <li class="icon_menu">
                            <a href=""> 전체메뉴 </a>
                        </li>
                    </ul>
                </div><!--.icons-->
            </div><!--.header_in-->
        </header><!--#header-->