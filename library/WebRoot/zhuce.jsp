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
<p>��¼</p>
</div>
	<div class="form" action="insert">
	<form action="">
		<div class="left">
		<input 	type="text" placeholder="�û���" class="username" size="50"  name="dto.username" /><br><br>
        <input type="password" placeholder="����" class="password" size="50" name="dto.password" /><br><br>
        <input type="password" placeholder="ȷ������" class="password" size="50"/><br><br>
        <input type="submit" value="ע��"  class="login" onclick="document.forms[0].action='example/insert'" />
        </div>
        <div class="right">
        <h4>��ӭע��ͼ�����ϵͳ</h4>
        <p>���������ע��һ���ʺţ��Ի�ȡ����ı������������ػ�������м�ֵ����Ϣ����ȡ��������������͵ȡ�</p><br>
        </div>
	</form>
	</div>
</div>
  </body>
</html>
