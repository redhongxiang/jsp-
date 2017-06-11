$(function(){
$("#user").blur(function(){
			if($(this).val()==""){
			$("#useryz").html("用户名不能为空");
			}
			else if($(this).val().length<=6 && !$(this).val()==""){
			$("#useryz").html("用户名不能少于六个字符");
			}else{
				$("#useryz").html("");
				if($("#pwd").val()!=="" && $("#pwd").val()==$("#pwd2").val()){
					$("#zhuce").click(function(){
						$(".form2").attr("action","example/insert");
						$("#submit1").submit();
						});
					
				}
				}
		});
$("#pwd2").blur(function(){
	if($(this).val()!=$("#pwd").val()){
		$("#pwdyz2").html("两次密码必须相同");
		$("#pwd").val("");
		$("#pwd2").val("");
		$("#pwd").focus();
		}else{
			$("#pwdyz2").html("");
			}
	if($("#user").val().length>6 && $("#pwd").val()!=""){
		$("#zhuce").click(function(){
			$(".form2").attr("action","example/insert");
			$("#submit1").submit();
			});
		
	}
	});
$("#user1").focus(function(){
	$(this).val("");
});
$("#pwd1").focus(function(){
	$(this).val("");});
$("#pwd").focus(function(){
	$(this).val("");
});
$("#pwd2").focus(function(){
	$(this).val("");});
$("#user").focus(function(){
	$(this).val("");
});
$("#user").focus(function(){
    $(this).val("");
	$("#useryz").html("");
	$("#pwdyz").html("");
	$("#pwdyz2").html("");
	});
$("#pwd").blur(function(){
	
		if($("#pwd").val()==""){
				$("#pwdyz").html("密码不能为空");
				}else{
					$("#pwdyz").html("");
				}
	});
$("#denglu").click(function(){
	$(".form1").attr("action","example/login");
	$("#submit").submit();

	});

});