<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/mainSource.jsp" %>
<link rel="stylesheet" href="../resources/css/BoardStyle.css">
<%@ include file="../includes/header.jsp" %>
    <div id="container">
        <div class="container_in">
            <div class="write">
                <h1>고객의 소리</h1>
				<form role="form" action="/board/write" method="post">
	                <div class="w_box">
	                
	                	<input type="hidden" name="writer" value="${login.userName}">
	                    <div class="w_title">
	                        <input type="text" name="title" placeholder="제목">
	                    </div><!--.w_title--> 
	
	                    <div class="w_content">
	                        <textarea name="content" id="" cols="100" rows="40" placeholder="내용"></textarea>
							<div class="w_content_file">
	                        	<input type="file" name="uploadFile" class="uploadFile" multiple>
	                        		<div id="uploadResult">
										<!-- 업로드한 파일의 썸네일이 들어갈 공간 -->
										<ul></ul>
									</div>
							</div><!--.w_content_file-->
	                    </div><!--.w_content-->
	
	                </div><!--.w_box-->
	
	                <div class="w_btn">
	                    <a href="/board/list" id="w_btn_cancle" class="w_btn_cancle">
	                    	<input type="button" value="취소">
	                    </a>
	                    <a href="#" class="w_btn_write">
	                    	<input type="submit" value="글쓰기" >
	                    </a>
	                </div><!--.w_btn-->
                </form>
			</div><!--.write-->
        </div><!--.container_in-->
    </div><!--#container-->
    
    <script type="text/javascript" src="../resources/js/uploadAjax.js"></script>
<%@ include file="../includes/footer.jsp" %>