<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ include file="header.jsp" %>

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
                        
                            <li class="d_title_bno" id="bno">${detail.bno}</li><!--.d_title_nam-->
                            <!-- <input type="text" name="bno" value="${detail.bno}"> -->
                            

                            <li class="d_title_hits">
                                	조회 : <span class="count">${detail.cnt}</span>
                            </li><!--.d_title_hits-->
                        </ul>
                    </div><!--.d_title-->



                    <div class="d_content">
						${detail.content}
						<div id="uploadResult">
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
                        	<input type="hidden" name="rno">


                            <textarea name="reply" id="" cols="4" placeholder="댓글을 입력해주세요."></textarea>

							
                            <div class="d_reply_submit">
                                <input type="submit" id="registerBtn" class="submit_btn" value="등록">
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


                    <div class="detail_view_wrap">
                        <table class="dvw_table">
                            <tr class="dvw_up">
                                <th>윗글</th>
                                <td>
                                    <a href="#">스타벅스커피 코리아 원산지 오표시 관련 고객설명문</a>
                                </td>
                            </tr><!--.dvw_up-->
                            <tr class="dvw_down">
                                <th>아랫글</th>
                                <td>
                                    <a href="#">2021 플래너 쿠폰 3종 유효 기간 연장 안내</a>
                                </td>
                            </tr><!--.dvw_down-->
                        </table>
                    </div><!--.detail_view_wrap-->

                    <div class="smap">
                        <ul>
                            <li class="smap_home">
                                <a href="#">
                                    HOME
                                </a>
                            </li>
                            <li class="smap_arr">
                                <img src="../resources/img/icon_arrow.png" alt="작은 맵 화살표">
                            </li>
                            <li class="smap_allmenu">
                                <a href="#">전체 메뉴</a>
                            </li>
                            <li class="smap_arr">
                                <img src="../resources/img/icon_arrow.png" alt="작은 맵 화살표">
                            </li>
                            <li class="smap_notice">
                                <a href="#">공지사항</a>
                            </li>
                        </ul>
                    </div><!--.smap-->
                    
                </div><!--.d_box-->
            </div><!--.board_detail-->
        </div><!--.container_in-->
    </div><!--#container-->
    
    
    
    <%@ include file="footer.jsp" %>