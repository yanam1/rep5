package com.git;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		RequestDispatcher rd;
		HttpSession sess;
		if(user.equalsIgnoreCase("Giridhar") && pass.equalsIgnoreCase("Test@123")){
			sess = request.getSession();
			sess.setAttribute("username", user);
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
		}else{
			sess = request.getSession();
			sess.setAttribute("username", user);
			rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
	}

}
