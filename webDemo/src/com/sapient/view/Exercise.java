package com.sapient.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercise
 */
public class Exercise extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercise() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	name=config.getServletContext().getInitParameter("Name");
    	age=config.getInitParameter("Age");
    }

	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("Name: "+request.getParameter("name")+"<br/>");
		out.println("Sex: "+request.getParameter("sex")+"<br/>");
		out.println("Interest: "+request.getParameter("choice"));
		out.println("</body>");
		out.println("</html>");
	    out.println(name);
	    out.println(age);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
