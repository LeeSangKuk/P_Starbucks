$(document).ready(function(){
	
	
	
    // icon_menu을 클릭하면
    $('.icon_menu>a').on('click', function(e){
    	e.preventDefault();
        $('.menu_bg').show();
        $('.sidebar_menu').show().animate({
            right:0
        });  
    });

    // colse_btn을 클릭하면
    $('.close_btn>a').on('click', function(){
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