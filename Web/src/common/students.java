package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session=request.getSession();
		if(sql==null){
	  	if(session.getAttribute("mysql")==null){
	  		sq="select * from student";
	  		session.setAttribute("mysql",sq);
	  	}
	  	else
	  	sq=session.getAttribute("mysql").toString();
	  }
	  else{
		  String bookname1=request.getParameter("name1");
		  String house1=request.getParameter("city");
	  
	    	
	     	if((bookname1==null && house1==null)||(bookname1=="" && house1=="") ){
	    	 sq="select * from student";
	    	}else if(bookname1==""){
	    		house1=new String(house1.getBytes("ISO8859-1"),"gb2312");
	    	sq="select * from student where city like'%"+house1+"%'";		
	   	}else if(house1==""){
	   		bookname1=new String(bookname1.getBytes("ISO8859-1"),"gb2312");
	   	sq="select * from student where name1 like'%"+bookname1+"%'";	
	   	}else{
	   		house1=new String(house1.getBytes("ISO8859-1"),"gb2312");
	   		bookname1=new String(bookname1.getBytes("ISO8859-1"),"gb2312");
	   		sq="select * from student where name1 like'%"+bookname1+"%' and city like'%"+house1+"%'";
	   	}
	   	session.setAttribute("mysql",sq);
	   }
	   out.print(view.checkAndView(sq,request.getParameter("page")));
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
