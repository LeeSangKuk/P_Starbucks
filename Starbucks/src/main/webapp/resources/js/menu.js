/**
 * 
 */

$(document).ready(function(){
	var as= $("#b_btn0").find('label>input').val();
	$(".menu_name_list").html(as);
	$('#b_btn0').find('label>input').attr("checked",true);
	$('.drink>ul').hide();
	$('.ColdBrewCoffee').show();
	$('.BrewCoffee').show();
	$('.Espresso').show();
	$('.Frappuccino').show();
	$('.Blended').show();
	$('.Fizzio').show();
	$('.Teavana').show();
	$('.Others').show();
	$('.Juice').show();
	
	// 0번 버튼
	$('#b_btn0').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn0').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.ColdBrewCoffee').show();
		$('.BrewCoffee').show();
		$('.Espresso').show();
		$('.Frappuccino').show();
		$('.Blended').show();
		$('.Fizzio').show();
		$('.Teavana').show();
		$('.Others').show();
		$('.Juice').show();
	});
	
	// 1번 버튼
	$('#b_btn1').on("click", function(e){
		var as= $(this).find('label>input').val();
		$('#b_btn1').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.ColdBrewCoffee').show();
		$(".menu_name_list").html(as);
	});
	
	// 2번 버튼
	$('#b_btn2').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn2').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.BrewCoffee').show();
	})
	
	// 3번 버튼
	$('#b_btn3').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn3').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Espresso').show();
	})
	
	// 4번 버튼
	$('#b_btn4').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn4').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Frappuccino').show();
	})
	
	// 5번 버튼
	$('#b_btn5').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn5').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Blended').show();
	})
	
	// 6번 버튼
	$('#b_btn6').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn6').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Fizzio').show();
	})
	
	// 7번 버튼
	$('#b_btn7').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn7').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Teavana').show();
	})
	
	// 8번 버튼
	$('#b_btn8').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn8').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Others').show();
	})
	
	// 9번 버튼
	$('#b_btn9').on("click", function(e){
		var as= $(this).find('label>input').val();
		$(".menu_name_list").html(as);
		$('#b_btn9').find('label>input').attr("checked",true);
		$('.drink>ul').hide();
		$('.Juice').show();
	})
	
	
	
});

