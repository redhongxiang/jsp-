package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsj.action.shu_action;

public class students extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public students() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sq="";
		String sql=request.getParameter("submit");
		if(sql==null){
	  		 out.print(shu_action.checkall());
	  }
	  else{
		  String bookname1=request.getParameter("cbs");
		  String house1=request.getParameter("shuming");
	  
	    	
	     	if((bookname1==null && house1==null)||(bookname1=="" && house1=="") ){
	     		 out.print(shu_action.checkall());
	    	}else if(bookname1==""){
	    		house1=new String(house1.getBytes("ISO8859-1"),"gb2312");
	    	
	    	out.print(shu_action.checkone1(house1));
	   	}else if(house1==""){
	   		bookname1=new String(bookname1.getBytes("ISO8859-1"),"gb2312");
	   	out.print(shu_action.checkone2(bookname1));
	   	}else{
	   		house1=new String(house1.getBytes("ISO8859-1"),"gb2312");
	   		bookname1=new String(bookname1.getBytes("ISO8859-1"),"gb2312");
	   	
	   		out.print(shu_action.checkandview(house1, bookname1));
	   	}
	
	   }
	  
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
