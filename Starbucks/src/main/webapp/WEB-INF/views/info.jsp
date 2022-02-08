<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/sub_info.css">
<%@ include file="./includes/header.jsp" %>
            <div class="section1">
                <div class="sectionIn">
                    <div class="himdleda"> 
                        <p class="box6a1"><h1>
                            <a href="/info" class="box6_a1">고객센터</a>
                        </h1>
                            <!-- p태그도연습 -->
                            <a href="" class="box6_b1">

                            </a>
                        </p>
                    </div>

                    <!-- 연습 -->
                    
                    <div class="box3">
                        
                        <div class="menu">
                            <h2>고객센터</h2>
                            <ul>                
                                <li><a href="/board/list">고객의 소리</a></li>
                                <li><a href="#">스토어케어</a></li>
                                <li><a href="#">전화 문의</a></li>
                             </ul>
                          </div>
                    </div> <!--box3-->

                    <div class="form">
                        <form>
                            <p>
                                <input type="text" class="form-text" placeholder=" 궁금하신 점을 입력해보세요">
                            </p>
                            <p>
                                <a href="#" class="btn_submit"></a>
                            </p>
                            <!-- 
                                <p class="forma1">
                                    <span>추천검색어:</span>
                                    <a href="">
                                        <span>상품환불</span>
                                        <span>/</span>
                                        <span>별적립</span>
                                        <span>/</span>
                                        <span>생일 쿠폰</span>
                                    </a>
                                </p>  
                            -->
                        </form>
                    </div><!--form-->
                    <ul class="keyword">
                        <li>
                           <a href="#">카드등록</a>
                        </li>
                        <li>
                           <a href="#">골든 레벨</a>

                        </li>
                        <li>
                           <a href="#">별 적립</a>
                            
                        </li>
                        <li>
                            <a href="#">생일 쿠폰</a>
                        </li>
                    </ul>
                </div><!--.sectionIn-->   

                <div class="box4">
                    <ul class="box4_a1">
                        <li><a href="#">
                                <p><img src="resources/img/sub_info/icon_discomfort.png" alt=""></p>
                                <p>방문 매장 불편사항</p> 
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_tip.png" alt=""></p>
                                <p>고객 의견 문의하기</p>
                                <!-- 향후를 위해서 만들어 놓음 이용팁 관련 세분화 하기 위해서 들어가서 나오는것들을 -->
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_survey.png" alt=""></p>
                                <p>고객 경험 설문조사</p>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_question.png" alt=""></p>
                                <p>자주 하는 질문</p>
                            </a>
                        </li>
                    </ul>
                    <ul class="box4_b1">
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_homepage.png" alt=""></p>
                                <p>홈페이지 이용 팁</p>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_application.png" alt=""></p>
                                <p class="width2">애플리케이션 이용 팁</p>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_card.png" alt=""></p>
                                <p>제휴카드 안내</p>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <p><img src="resources/img/sub_info/icon_receipt.png" alt=""></p>
                                <p class="width">비회원 전자영수증 조회</p>
                            </a>
                        </li>
                    </ul> 
                </div> <!--box4-->
            </div><!--section1-->
		<%@ include file="./includes/footer.jsp" %>   