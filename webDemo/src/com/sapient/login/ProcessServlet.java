package com.sapient.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessServlet
 */
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("name");
		String password=request.getParameter("pass");
		if(userName.equalsIgnoreCase("Atul")&&password.equals("pass#123")){
			HttpSession session=request.getSession(true);
			session.setMaxInactiveInterval(10);
			Cookie cookie=new Cookie("name","Atul");
			cookie.setMaxAge(7*24 * 60 * 60); 
			response.addCookie(cookie);
			request.getRequestDispatcher("/login/welcome.jsp").forward(request, response);;
		}
		else{
			response.sendRedirect("login.html");
		}
				
	}

}
