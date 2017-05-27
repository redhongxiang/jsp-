package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class student extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public student() {
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
		response.setCharacterEncoding("GB2312");
		PrintWriter out = response.getWriter();
 		String sq1="select * from user where user='"+request.getParameter
			("username")+"'";
	if(view.exist(sq1)==1){
	String sql2="insert into user(user,pass) values('" +request.getParameter
			("username")+"','"+request.getParameter("password")+"')";
			view.insert(sql2);
	out.println("<!DOCTYPE html><html><head><title></title><script>window.onload=function(){alert('注册成功 是否进入首页');var time=setTimeout(function(){location.href='../students.jsp?username="+request.getParameter("username")+"';},0);}</script></head><body></body></html>");
	}else{
		out.println("<!DOCTYPE html><html><head><title></title><script>window.onload=function(){alert('用户名已存在 是否返回');var time=setTimeout(function(){location.href='../login.html';},0);}</script></head><body></body></html>");
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
		response.setCharacterEncoding("GB2312");
		PrintWriter out = response.getWriter();
		int sql=view.exist("select * from user where user='"+request.getParameter("username")+"' and pass='"+request.getParameter("password")+"'");
		if(sql==1){
			out.println("<!DOCTYPE html><html><head><title></title><script>window.onload=function(){alert('登录失败 是否返回');var time=setTimeout(function(){location.href='../login.html';},0);}</script></head><body></body></html>");
		}else{
		   response.sendRedirect("../students.jsp?username="+request.getParameter("username"));
		}
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
