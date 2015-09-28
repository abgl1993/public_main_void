package com.sapient.processor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapeint.model.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		String email=request.getParameter("emailid");
		String password=request.getParameter("pass");
		User user = new User();
		boolean status=user.validateLogin(email, password);
		if(status){
			user.setEmail(email);
			request.setAttribute("userBean", user);
			request.getRequestDispatcher("/index.html").forward(request, response);
		}
		else{
			PrintWriter out=new PrintWriter(System.out,true);
			out.println("Reched to else loop");
			//request.getRequestDispatcher("/Login.html").forward(request, response);
		}
		
	}

}
