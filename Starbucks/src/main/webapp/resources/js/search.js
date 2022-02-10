/**
 * 
 */
$(document).ready(function(){

    // icon_menu을 클릭하면
    $('.icon_search>a').on('click', function(){
        $('.menu_bg').show();
        $('.header_search').show();
    });

     // colse_btn을 클릭하면
     $('.h_search_close>a').on('click', function(){
         $('.menu_bg').hide();
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
