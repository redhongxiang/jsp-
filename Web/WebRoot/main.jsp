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
  System.out.println("中文乱码解决问题出错"+e.getMessage());
 }
 return "null";
}
%>
    <title>首页</title>
    
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
  <div class="bt">吉祥交友网</div><img src="images/3.png" class="imghead">
  <div class="headname">
  <%
  if(request.getParameter("username")!=null){
session.putValue("cartid",request.getParameter("username"));}else{

}
%>
<%="<span class='hy'>欢迎用户:</span>"+session.getValue("cartid") %>
  </div>
  </div>
  <div class="navs"><ul class="ul1"><Li class="list1">首页</Li><Li>真心话</Li><Li>会员推荐</Li><Li>找缘分</Li></ul></div>
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
<div class="right1"><img src="images/15.png"><p>全国最大、诚信会员最多的交友约会平台</p>
<p>比传统交友网站的成功率高出  2 倍以上</p></div>
</div>
<div class="center">
<div class="form1">我要找：</div>
  <form action="students.jsp" class="form1">
  <input type="text" name="name1">姓名 
  <input type="text" name="city">城市
  <input type="submit" name="submit" value="提交"/> 
  </form>
  </div><div class="left1"><h4>VIP 会员服务</h4>
  <div class="vipimgs"><img src="images/vip0.jpg" class="vip">
  <ul class="ul3">
  <li>身份更尊贵</li>
  <li>邮件置顶</li>
  <li>礼物置顶</li>
  <li>生日大礼包</li>
  </ul>
  </div><div><img src="images/vip2.jpg" class="vip">
  <ul class="ul3">
  <li>每日专属魅力值</li>
  <li>尊贵身份显示</li>
  <li>查看谁看过我</li>
  <li>查看最后登录时间</li>
  </ul>
  </div>
  <div><img src="images/vip3.jpg" class="vip">
  <ul class="ul3">
  <li>VIP礼物专区</li>
  <li>限定交友条件</li>
  <li>设定爱情密码</li>
  <li>保存搜索条件</li>
  </ul>
  </div>
  </div>
  <div class='main'><div class='content'>
  <jsp:include page='<%="servlet/peplo"%>'></jsp:include></div></div></div></div>
  </body>
  </body>
</html>