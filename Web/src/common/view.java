package common;
import java.sql.*;
public class view {
	public static String checkAndView(String sq,String page){
		String str;
		try
	    {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");}
	    catch(Exception e1){
	     return e1.toString();
	    }
	    try{
	    	Connection con=DriverManager.getConnection
	    	("jdbc:odbc:data","root","root");
	    	Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    	ResultSet rs;
	   	  rs=stm.executeQuery(sq);
	   	  if(rs.next()){
	   	  rs.last();
	    	int count=rs.getRow();
	    	int pageSize=12;
	    	int pageCount=(count+pageSize-1)/pageSize;
	    	String Page=page;
	    	int pageNow;
	    	if(Page==null)
	    	pageNow=1;
	    	else
	    	pageNow=Integer.parseInt(Page);
	    	rs.absolute((pageNow-1)*pageSize+1);
	    	str="<h2>才子佳人</h2>";
	    	int rsCount=rs.getMetaData().getColumnCount();
	    	for(int i=0;i<pageSize&&!rs.isAfterLast();i++){ 
	    		str+="<a class='div1'  href='main.jsp?id="+rs.getString(2)+"'>";
	    		str+="<div class='divs'><img src='images/"+rs.getString(1)+"' class='imgs'>";
    			str+="</div>";
    			str+="<div class='divs'><span class='span1'>姓名：</span><span class='span2'>";
    			str+=rs.getString(3);
    			str+="</span></div>";
    			str+="<div class='divs'><span class='span1'>年龄：</span><span class='span2'>";
    			str+=rs.getString(4);
    			str+="</span></div>";
    			str+="<div class='divs'><span class='span1'>性别：</span><span class='span2'>";
    			str+=rs.getString(7);
    			str+="</span></div>";
    			str+="<div class='divs'><span class='span1'>城市：</span><span class='span2'>";
    			str+=rs.getString(5);
    			str+="</span></div>";
    			str+="<div class='divs'><span class='span1'>联系方式：</span><span class='span2'>";
    			str+=rs.getString(6);
    			str+="</span></div>";
	    		str+="</a>";
	    		rs.next();
	    	}
	    	str+="<div class='odiv'>";
	    	 	for(int i=1;i<=pageCount;i++){
	    	 		str+=""+"<a class='a1' href='students.jsp?page="+i+"'>"+i+"</a>"+"";
	    	 	}
	    	 	str+="</div><div class='usercount'>"+count+"</div>";
	   	}else{
	    	return "login fail";
	    }
	    	}catch(Exception e){ 
	    		return e.toString(); 
	    } 
	    	return str;
	}
	public static String check(String sq){
		try
	    {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");}
	    catch(ClassNotFoundException e){
	     return "404";
	    }
	    try{
	    	Connection con=DriverManager.getConnection
	    	("jdbc:odbc:data","root","root");
	    	Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    	ResultSet rs;
	    	
	    	rs=stm.executeQuery(sq);
	    	rs.next();
	    	String str;
	    	str="<div class='divs'><img src='images/"+rs.getString(1)+"' class='imgs'>";
			str+="</div>";
			str+="<div class='divs'><div class='inter'><span class='span1'>姓名：</span><span class='span2'>";
			str+=rs.getString(3);
			str+="</span><br>";
			str+="<span class='span1'>年龄：</span><span class='span2'>";
			str+=rs.getString(4);
			str+="</span><br>";
			str+="<span class='span1'>性别：</span><span class='span2'>";
			str+=rs.getString(7);
			str+="</span><br>";
			str+="<span class='span1'>城市：</span><span class='span2'>";
			str+=rs.getString(5);
			str+="</span><br>";
			str+="<span class='span1'>联系方式：</span><span class='span2'>";
			str+=rs.getString(6);
			str+="</span><br>";
			str+="<span class='span1'>婚否：</span><span class='span2'>";
			str+=rs.getString(8);
			str+="</span><br>";
			str+="<span class='span1'>职业：</span><span class='span2'>";
			str+=rs.getString(9);
			str+="</span><br>";
			str+="<span class='span1'>介绍：</span><div class='div3'>";
			str+=rs.getString(10);
			str+="</div><br>";
			str+="</div></div>";
	    	return str;
	}catch(Exception e2){
		return "111";
	}
	}
	public static int insert(String sq){
		try
	    {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");}
	    catch(ClassNotFoundException e){
	     return 404;
	    }
	    try{
	    	Connection con=DriverManager.getConnection
	    	("jdbc:odbc:data","root","root");
	    	Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    	stm.executeUpdate(sq);
	    	return 1;
		
	}catch(Exception e2){
		return 111;
	}
	}
	public static int  exist(String sq){
		try
	    {Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");}
	    catch(ClassNotFoundException e){
	     return 404;
	    }
	    try{
	    	Connection con=DriverManager.getConnection
	    	("jdbc:odbc:data","root","root");
	    	Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    	ResultSet rs;
		   	  rs=stm.executeQuery(sq);
		   	  if(!rs.next()){
		   		return 1;
		   	  }else{
		   		return 2; 
		   	  }
		
	}catch(Exception e2){
		return 101;
	}
	}
}
