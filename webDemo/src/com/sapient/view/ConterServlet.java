package com.sapient.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConterServlet
 */
public class ConterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getHeaders(getServletInfo());
		
          PrintWriter out=response.getWriter();
          out.println("<html>");
          out.println("<head>");
          out.println("</head>");
          out.println("<body>");
          out.println(request.getRemoteAddr());
          Enumeration<String> headerNames=request.getHeaderNames();
          String headerName;
          while(headerNames.hasMoreElements()){
        	  headerName=headerNames.nextElement();
        	  out.println(headerName+":"+request.getHeader(headerName)+"<br/>");
          }
          out.println("</body>");
          out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
