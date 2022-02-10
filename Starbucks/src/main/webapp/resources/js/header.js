$(document).ready(function(){
	
	
	
    // icon_menu을 클릭하면
    $('.icon_menu>a').on('click', function(e){
    	e.preventDefault();
    	$('.bx-controls-direction').hide();
        $('.search_bg').hide();
        $('.header_search').hide();
        $('.menu_bg').show();
        $('.sidebar_menu').show().animate({
            right:0
        });  
    });

    // colse_btn을 클릭하면
    $('.close_btn>a').on('click', function(){
    	$('.bx-controls-direction').show();
        $('.menu_bg').hide(); 
        $('.sidebar_menu').animate({
            right: '-' + 50 + '%'
                   },function(){
        $('.sidebar_menu').hide(); 
        }); 
    });
    
    // close_btn이 아닌 menu_bg를 클릭해도 닫히게
    $('.menu_bg').on('click', function(){
    	$('.bx-controls-direction').show();
        $('.menu_bg').hide(); 
        $('.sidebar_menu').animate({
            right: '-' + 50 + '%'
                   },function(){
        $('.sidebar_menu').hide(); 
        }); 
    });

    // $('.menu_wrap>ul>li>a').on('mouseover', function(){
    //     $('.menu_title>a').css('color','#007042');
    //     $('.menu_title>a').not(this).css('color','#333');
    // });

    // $('.menu_wrap>ul>li>a').on('mouseout', function(){
    //     $('.menu_title>a').css('color','#333');
    // });

});