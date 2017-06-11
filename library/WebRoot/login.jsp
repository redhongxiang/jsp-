<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="xq.css">
  </head>
  
  <body>
     <div class="container">
<div class="head">
<p>登录</p>
</div>
	<div class="form">
	<form action="login">
		<div class="left">
		<input 	type="text" placeholder="用户名" name="dto.username" class="username" size="50" /><br><br>
        <input type="password" placeholder="密码" class="password"size="50"  name="dto.password"/><br><br>
        <input type="submit" value="登录"  class="login"  onclick="document.forms[0].action='example/login'" />
        </div>
        <div class="right">
        <h4>欢迎登录图书管理系统</h4>
        <p>您可以免费注册一个帐号，以获取更多的便利，例如下载或浏览更有价值的信息，获取针对您的内容推送等。</p><br>
        <input type="buttom" onclick="location.href='zhuce.jsp'" value="注册"  class="sign" />
        </div>
	</form>
	</div>
</div>
 
  </body>
</html>


