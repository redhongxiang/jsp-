<%@ page language="java" import="java.util.*,common.view" pageEncoding="GB2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">


    <%!
public String Bytes(String str)
{
 try
 {
  String str_1=str;
  byte[] str_2=str_1.getBytes("ISO8859-1");
  String bytes=new String(str_2);
  return bytes;
 }
  catch(Exception e)
 {
  System.out.println("�����������������"+e.getMessage());
 }
 return "null";
}
%>
    <title>��ҳ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<link rel="stylesheet" type="text/css" href="css/main2.css">
	<link rel="stylesheet" type="text/css" href="css/lb.css">
	<script type="text/javascript" src="js/jquery-1.11.2.js"></script>
<script type="text/javascript" src="js/lb.js"></script>
  </head>
  
  <body>
   <div class="contents">
  <div class="header">
  <div class="bt">���齻����</div><img src="images/3.png" class="imghead">
  <div class="headname">
  <%
  if(request.getParameter("username")!=null){
session.putValue("cartid",request.getParameter("username"));}else{

}
%>
<%="<span class='hy'>��ӭ�û�:</span>"+session.getValue("cartid") %>
  </div>
  </div>
  <div class="navs"><ul class="ul1"><Li class="list1">��ҳ</Li><Li>���Ļ�</Li><Li>��Ա�Ƽ�</Li><Li>��Ե��</Li></ul></div>
  <div class="section">
  <div class="banner">
<div class="container">
<div id="img">
<img src="images/5.png" class="img11" />
<img src="images/6.jpg" class="img11" />
<img src="images/7.png" class="img11" />
</div>
<div>
<div id="hh">
<span class="spans"></span>
<span class="spans"></span>
<span class="spans"></span></div>
<div id="point">
<div class="left"><</div>
<div class="right">></div>
</div>
</div>
</div>
<div class="right1"><img src="images/15.png"><p>ȫ����󡢳��Ż�Ա���Ľ���Լ��ƽ̨</p>
<p>�ȴ�ͳ������վ�ĳɹ��ʸ߳�  2 ������</p></div>
</div>
<div class="center">
<div class="form1">��Ҫ�ң�</div>
  <form action="students.jsp" class="form1">
  <input type="text" name="name1">���� 
  <input type="text" name="city">����
  <input type="submit" name="submit" value="�ύ"/> 
  </form>
  </div><div class="left1"><h4>VIP ��Ա����</h4>
  <div class="vipimgs"><img src="images/vip0.jpg" class="vip">
  <ul class="ul3">
  <li>��ݸ����</li>
  <li>�ʼ��ö�</li>
  <li>�����ö�</li>
  <li>���մ����</li>
  </ul>
  </div><div><img src="images/vip2.jpg" class="vip">
  <ul class="ul3">
  <li>ÿ��ר������ֵ</li>
  <li>��������ʾ</li>
  <li>�鿴˭������</li>
  <li>�鿴����¼ʱ��</li>
  </ul>
  </div>
  <div><img src="images/vip3.jpg" class="vip">
  <ul class="ul3">
  <li>VIP����ר��</li>
  <li>�޶���������</li>
  <li>�趨��������</li>
  <li>������������</li>
  </ul>
  </div>
  </div>
  <div class='main'><div class='content'>
  <jsp:include page='<%="servlet/peplo"%>'></jsp:include></div></div></div></div>
  </body>
  </body>
</html>