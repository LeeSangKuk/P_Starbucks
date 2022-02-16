<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/sub_menu.css">
<%@ include file="./includes/header.jsp" %>
        <div id="container"><!----------------------------#container start-------------------------------->
            <div class="section1"><!--.section1-->
                <div class="event">
                	<ul class="bxslider">
                		<li><img src="resources/img/sub_menu/test/11.png" alt="테스트1"></li>
                		<li><img src="resources/img/sub_menu/test/22.png" alt="테스트2"></li>
                		<li><img src="resources/img/sub_menu/test/33.png" alt="테스트3"></li>
                		<li><img src="resources/img/sub_menu/test/44.png" alt="테스트4"></li>
                	</ul>
                </div><!--event-->
            </div><!--section1-->
            <div class="section2">
                <div class="menu_list">
                    <div class="category">
                        <ul>
                            <li class="active1"><a href="#">음료</a></li>
                            <!-- 태그를 클릭할 때 밑줄 생성 및 글자 색상 변경을 원함.-->
                            <li><a href="#">디저트</a></li>
                            <li><a href="#">상품</a></li>
                            <li><a href="#">카드</a></li>
                        </ul>
                    </div><!--category-->
                    <div class="m_box">
                        <ul>
                            <li class="b_btn" id="b_btn0"><label><input type="radio" name=slect checked>전체</label></li>
                            <li class="b_btn" id="b_btn1"><label><input type="radio" name=slect>콜드 브루 커피</label></li>
                            <li class="b_btn" id="b_btn2"><label><input type="radio" name=slect>브루드 커피</label></li>
                            <li class="b_btn" id="b_btn3"><label><input type="radio" name=slect>에스프레소</label></li>
                            <li class="b_btn" id="b_btn4"><label><input type="radio" name=slect id="check2" class="checkbox2">프라푸치노</label></li>
                            <!-- 1. 전체에 체크되었을 때, 나머지 체크박스가 전부 해제 되길 원함.
                                 2. 체크가 되었을 때, 이름의 색깔이 변하게 하고 싶음.  -->
                            <li class="b_btn" id="b_btn5"><label><input type="radio" name=slect>블렌디드</label></li>
                            <li class="b_btn" id="b_btn6"><label><input type="radio" name=slect>스타벅스 피지오</label></li>
                            <li class="b_btn" id="b_btn7"><label><input type="radio" name=slect>티(티바나)</label></li>
                            <li class="b_btn" id="b_btn8"><label><input type="radio" name=slect>기타 제조 음료</label></li>
                            <li class="b_btn" id="b_btn9"><label><input type="radio" name=slect>스타벅스 주스(병음료)</label></li>
                        </ul>
                    </div><!--m_box-->
                </div><!--menu_list-->
            </div><!--section2-->
            <div class="section3">
                <div class="menu_name">
                    <h2 class="menu_name_list">프라푸치노 (Frappuccino)</h2>
                    <p><span class="decaf">디카페</span>디카페인 에스프레소 샷 추가 가능 (일부 음료 제외)</p>
                    <p class="alert"><span class="pay">원</span><span class="point">Tall</span> 기준입니다.</p>
                </div><!--ㅡmenu_name-->
                <div class="small_bar">
                    <p class="home"><a href="/main"><span>집 그림</span>HOME</a></p>
                    <p class="bar_down"><a href="#">MENU<span>아래</span></a></p>
                    <p class="bar_down"><a href="#">프라푸치노<span>아래</span></a></p>
                </div><!--small_bar-->
                <div class="drink">
                    <ul class="Frappuccino"><!------ 전체 메뉴 묶음 ------->
                        <li class="chapter1"><!-- 1번 영역 시작 -->
                            <div class="d01">
                                <a href="#">
                                    <p class="dn_ko">토피 넛 프라푸치노</p>
                                    <p class="dn_en">Toffee Nut Frappuccino</p>
                                    <p class="price"><span>원</span>6,300</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-01.png" alt="토피 넛 프라푸치노"></p>
                                </a>
                                <p class="sticker01"><img src="resources/img/sub_menu/icon-new.png" alt="new-icon"></p>
                            </div>
                            <div class="d02">
                                <a href="#">
                                    <p class="dn_ko">모카 프라푸치노</p>
                                    <p class="dn_en">Mocha Frappuccino</p>
                                    <p class="price"><span>원</span>5,600</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-02.png" alt="모카 프라푸치노"></p>
                                </a>
                            </div>
                            <div class="d03">
                                <a href="#">
                                    <p class="dn_ko">제주 까망 크림 프라푸치노</p>
                                    <p class="dn_en">Jeju Black Sesame Cream Frappuccino</p>
                                    <p class="price"><span>원</span>7,500</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-08.png" alt="제주 까망 크림 프라푸치노"></p>
                                </a>
                                <p class="sticker03"><img src="resources/img/sub_menu/icon-only-jeju.png" alt="jeju-only"></p>
                            </div>
                            <div class="d04">
                                <a href="#">
                                    <p class="dn_ko">제주 쑥떡 크림 프라푸치노</p>
                                    <p class="dn_en">Jeju Mugwort Cream Frappuccino</p>
                                    <p class="price"><span>원</span>7,500</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-09.png" alt="제주 쑥떡 크림 프라푸치노"></p>
                                </a>
                                <p class="sticker04"><img src="resources/img/sub_menu/icon-only-jeju.png" alt="jeju-only"></p>
                            </div>
                        </li><!-- 1번 영역 끝 -->

                        <li class="chapter2"><!-- 2번 영역 시작 -->
                            <div>
                                <a href="#">
                                    <p class="dn_ko">바닐라 크림 프라푸치노</p>
                                    <p class="dn_en">Vanilla Cream Frappuccino</p>
                                    <p class="price"><span>원</span>4,800</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-07.png" alt="바닐라 크림 프라푸치노"></p>
                                </a>
                            </div>
                            <div>
                                <a href="#">
                                    <p class="dn_ko">더블 에스프레소 칩 프라푸치노</p>
                                    <p class="dn_en">Double Espresso Chip Frappuccino</p>
                                    <p class="price"><span>원</span>6,100</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-02.png" alt="더블 에스프레소 칩 프라푸치노"></p>
                                </a>
                            </div>
                            <div>
                                <a href="#">
                                    <p class="dn_ko">자바 칩 프라푸치노</p>
                                    <p class="dn_en">Java Chip Frappuccino</p>
                                    <p class="price"><span>원</span>6,100</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-04.png" alt="자바 칩 프라푸치노"></p>
                                </a>
                            </div>
                            <div>
                                <a href="#">
                                    <p class="dn_ko">카라멜 프라푸치노</p>
                                    <p class="dn_en">Caramel Frappuccino</p>
                                    <p class="price"><span>원</span>5,600</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-05.png" alt="카라멜 프라푸치노"></p>
                                </a>
                            </div>
                        </li><!-- 2번 영역 끝 -->

                        <li class="chapter3"><!-- 3번 영역 시작 -->
                            <div>
                                <a href="#">
                                    <p class="dn_ko">제주 유기농 말차 크림 프라푸치노</p>
                                    <p class="dn_en">Malcha Cream Frappuccino from Jeju Organic Farm</p>
                                    <p class="price"><span>원</span>6,300</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-10.png" alt="제주 유기농 말차로 만든 크림 프라푸치노"></p>
                                </a>
                            </div>
                            <div>
                                <a href="#">
                                    <p class="dn_ko">초콜릿 크림 칩 프라푸치노</p>
                                    <p class="dn_en">Chocolate Cream Chip Frappuccino</p>
                                    <p class="price"><span>원</span>5,700</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-11.png" alt="초콜릿 크림 칩 프라푸치노"></p>
                                </a>
                            </div>
                            <div>
                                <a href="#">
                                    <p class="dn_ko">화이트 초콜릿 모카 프라푸치노</p>
                                    <p class="dn_en">White Chocolate Mocha Frappuccino</p>
                                    <p class="price"><span>원</span>5,700</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-06.png" alt="화이트 초콜릿 모카 프라푸치노"></p>
                                </a>
                            </div>
                            <div>
                                <a href="#">
                                    <p class="dn_ko">화이트 타이거 프라푸치노</p>
                                    <p class="dn_en">White Tiger Frappuccino</p>
                                    <p class="price"><span>원</span>6,500</p>
                                    <p class="ccino"><img src="resources/img/sub_menu/menu-12.png" alt="화이트 타이거 프라푸치노"></p>
                                </a>
                            </div>
                        </li><!-- 3번 영역 끝 -->
                    </ul><!------ 프라푸치노 메뉴 묶음 ------->
                    <ul class="ColdBrewCoffee">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="BrewCoffee">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="Espresso">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="Blended">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="Fizzio">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="Teavana">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="Others">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                    <ul class="Juice">
                    	<li class="chapter1">상품없음</li>
                    </ul>
                </div><!--drink-->
            </div><!--section3-->
        </div><!------------------------------#container-------------------------------->
      <script type="text/javascript" src="../resources/js/menu.js"></script>
      <%@ include file="./includes/footer.jsp" %>