<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/BoardStyle.css">
<%@ include file="../includes/header.jsp" %>
       <div id="container">
        <div class="container_in">
            <div class="board_detail">
                <h1>고객의 소리</h1>
                <div class="d_box">
                    <div class="d_title">
                        <ul>
                        
                        	<li class="d_title_name">
								${detail.title}
                            </li><!--.cs_title_nam-->
                        
                            <li class="d_title_bno"><input type="hidden" id="bno" value="${detail.bno}"></li><!--.d_title_nam-->
                            <!-- <input type="text" name="bno" value="${detail.bno}"> -->
                            

                            <li class="d_title_hits">
                                	조회 : <span class="count">${detail.cnt}</span>
                            </li><!--.d_title_hits-->
                        </ul>
                    </div><!--.d_title-->



                    <div class="d_content">
						${detail.content}
						<div id="uploadResult">
						<!-- 업로드한 파일이 들어갈 공간 -->
							<ul></ul>
						</div>
                    </div><!--.n_content-->

                    <div class="d_reply">

                        <div class="relist_box">
                            <ul id="relist">
                                <!-- <li>
                                    <div><b>작성자</b></div>
                                    <div>댓글내용</div>
                                </li>

                                <li>
                                    <div><b>작성자</b></div>
                                    <div>댓글내용</div>
                                </li> -->
                            </ul>
                        </div><!--.relist_box-->


                        <h2>댓글</h2>


                        <div class="d_reply_form">
                        	<div class="field">
                                <input type="hidden" name="rno" class="field_rno" readonly>
                                <input type="text" name="replyer" value="" class="field_replyer">
                            </div>


                            <textarea name="reply" id="" cols="4" placeholder="댓글을 입력해주세요."></textarea>

							
                            <div class="d_reply_submit">
                                <input type="submit" id="d_reply_regBtn" class="submit_btn" value="등록">
                            </div>
                        </div><!--.re_write-->
                    </div><!--.d_reply-->


                    <div class="d_btns">
                    	<ul>
                    	
                    		<li class="d_del_btn">
	                            <a href="/board/remove">삭제</a>
	                        </li><!--.d_del_btn-->
	                        
	                        
	                        <li class="d_write_btn">
	                            <a href="/board/modify">수정</a>
	                        </li><!--.d_write_btn-->
    

							<li class="d_list_btn">
	                            <a href="/board/list">목록</a>
	                        </li><!--.d_list_btn-->
                        </ul>
                    </div>
                    
                </div><!--.d_box-->
            </div><!--.board_detail-->
        </div><!--.container_in-->
    </div><!--#container-->
    <script type="text/javascript" src="../resources/js/detail.js"></script>
    <%@ include file="../includes/footer.jsp" %>