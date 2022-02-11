<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/BoardStyle.css">
<%@ include file="../includes/header.jsp" %>
    <div id="container">
        <div class="container_in">
            <section class="notice">
                <h1>고객의 소리</h1>
                <div class="l_box">
                    <div class="l_b1_list">
                        <table class="l_table">
                            <thead>
                                <tr>
                                    <th class="list_num">NO</th>
                                    <th class="list_title">제목</th>
                                    <th class="list_writer">작성자</th>
                                    <th class="list_date">작성일</th>
                                    <th class="list_hits">조회수</th>
                                </tr>
                            </thead>
                            <tbody>
                            	<c:forEach items="${list}" var="board">
	                                <tr>
	                                    <td class="list_num">${board.bno}</td>
	                                    <td class="list_title"><a href="/board/detail?bno=${board.bno}">${board.title}</a></td>
	                                    <td class="list_writer">${board.writer}</td>
	                                    <td class="list_date">${board.regdate}</td>
	                                    <td class="list_hits">${board.cnt}</td>
	                                </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div><!--l_b1-->
					
					<c:if test="${login!=null}">
						<div><a href="/board/write" class="write_btn">글쓰기</a></div>
					</c:if>
					<!-- <div><a href="/board/write" class="write_btn">글쓰기</a></div> -->
					

                    <!-- search -->
                    <div class="l_b2_search">
                        <form id="actionForm" action="/board/list" method="get">
                            <div>

                                <input type="hidden" name="pageNum" placeholder="pageNum" value="${pageMaker.cri.pageNum}">
                                <input type="hidden" name="amount" placeholder="amount" value="${pageMaker.cri.amount}">

                            </div>
                            <select name="search" id="">
                                <option value="T" <c:out value="${pageMaker.cri.search == 'T' ? 'selected' :''}"/> >제목</option>
                                <option value="C" <c:out value="${pageMaker.cri.search == 'C' ? 'selected' :''}"/> >내용</option>
                                <option value="W" <c:out value="${pageMaker.cri.search == 'W' ? 'selected' :''}"/> >작성자</option>
                                <option value="TC" <c:out value="${pageMaker.cri.search == 'TC' ? 'selected' :''}"/> >제목+내용</option>
                                <option value="TCW" <c:out value="${pageMaker.cri.search == 'TCW' ? 'selected' :''}"/> >제목+내용+작성자</option>
                            </select><!--.search-->
                            <input type="text" value="${pageMaker.cri.keyword}" name="keyword" class="s_sc">
                            <input type="submit" value="검색" class="s_btn">
                        </form>
                    </div><!--l_b2_search-->

                    <!-- pager -->
                    <div class="l_b3_pager">
                        <ul>
                            <c:if test="${pageMaker.prev}">
                                <li class="paginate_button">
                                    <a href="${pageMaker.startPage-1}">이전으로</a>
                                </li>
                            </c:if>
                            
                            <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                                <li class="paginate_button ${pageMaker.cri.pageNum == num ? 'active':'' }"><a href="${num}" class="bold">${num}</a></li>
                            </c:forEach>
                            
                            <c:if test="${pageMaker.next}">
                                <li class="paginate_button">
                                    <a href="${pageMaker.endPage+1}">다음으로</a>
                                </li>
                            </c:if>
                        </ul>
                    </div><!--.l_b3_pager-->

                </div><!--.l_box-->
            </section><!--.notice-->
        </div><!--.container_in-->
    </div><!--#container-->
    <script type="text/javascript" src="../resources/js/list.js"></script>
    <%@ include file="../includes/footer.jsp" %>