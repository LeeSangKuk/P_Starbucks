$(document).ready(function(){
	
	
	
    // icon_menu을 클릭하면
    $('.icon_menu>a').on('click', function(e){
    	e.preventDefault();
        $('.search_bg').hide();
        $('.header_search').hide();
        $('.menu_bg').show();
        $('.sidebar_menu').show().animate({
            right:0
        });
        
        $('body').css("overflow", "hidden"); // 전체 메뉴가 나오면 스크롤 안되게

    });

    // colse_btn을 클릭하면
    $('.close_btn>a').on('click', function(){
        $('.menu_bg').hide(); 
        $('.sidebar_menu').animate({
            right: '-' + 50 + '%'
                   },function(){
        $('.sidebar_menu').hide(); 
        }); 
        
        $('body').css("overflow", "scroll"); // 전체 메뉴 닫으면 스크롤 되게
    });
    
    // close_btn이 아닌 menu_bg를 클릭해도 닫히게
    $('.menu_bg').on('click', function(){
        $('.menu_bg').hide(); 
        $('.sidebar_menu').animate({
            right: '-' + 50 + '%'
                   },function(){
        $('.sidebar_menu').hide(); 
        }); 
        
        $('body').css("overflow", "scroll"); // 전체 메뉴 닫으면 스크롤 되게
    });

    // $('.menu_wrap>ul>li>a').on('mouseover', function(){
    //     $('.menu_title>a').css('color','#007042');
    //     $('.menu_title>a').not(this).css('color','#333');
    // });

    // $('.menu_wrap>ul>li>a').on('mouseout', function(){
    //     $('.menu_title>a').css('color','#333');
    // });

});