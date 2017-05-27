$(function(){
	$("#login").mouseover(function(){
		$(this).addClass("active");
		$("#sign").removeClass("active");
		$("#ul1").show();
		$("#ul2").hide();
		});
	$("#sign").mouseover(function(){
		$("#ul2").show();
		$(this).addClass("active");
		$("#login").removeClass("active");
		$("#ul1").hide();
		$("#useryz").html("");
		$("#pwdyz").html("");
		$("#pwdyz2").html("");
		
		});
	
	})