<%@ page language="java" import="java.util.*,com.jsj.action.shu_action" pageEncoding="GB2312"%>
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
  </head>
  
  <body>
   <form action="students.jsp" class="form1">
     <input type="text" name="shuming">����
  <input type="text" name="cbs">������ 
  <input type="submit" name="submit" value="�ύ"/> 
  </form>
 <jsp:include page='<%="servlet/students"%>'></jsp:include>
  </body>
</html>

