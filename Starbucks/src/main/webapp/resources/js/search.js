/**
 * 
 */
$(document).ready(function(){

    // icon_menu을 클릭하면
    $('.icon_search>a').on('click', function(){
        $('.menu_bg').hide();
        $('.sidebar_menu').hide(); 
        $('.search_bg').show();
        $('.header_search').show();
    });

     // colse_btn을 클릭하면
     $('.h_search_close>a').on('click', function(){
         $('.search_bg').hide();
         $('.header_search').hide();
     });
     
     // close_btn이 아닌 menu_bg를 클릭해도 닫히게
     $('.search_bg').on('click', function(){
         $('.search_bg').hide();
         $('.header_search').hide();
     });
    // $('.menu_wrap>ul>li>a').on('mouseover', function(){
    //     $('.menu_title>a').css('color','#007042');
    //     $('.menu_title>a').not(this).css('color','#333');
    // });

    // $('.menu_wrap>ul>li>a').on('mouseout', function(){
    //     $('.menu_title>a').css('color','#333');
    // });

});
