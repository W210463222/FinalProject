package com.hccs.advweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjectServlet
 */
@WebServlet("/ProjectServlet")
public class FinalProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Here is your code for business logic
		System.out.println("<h1>This is my project</h1>");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Car Wash Membership Form</h1>");
		String a = request.getParameter("firstname");
		String b = request.getParameter("lastname");
		String c = request.getParameter("phone");
		String d = request.getParameter("email");
		String e = request.getParameter("make");
		String f = request.getParameter("model");
		String g = request.getParameter("year");
		String h = request.getParameter("plate");
		out.println("Thank you " + a + " " + b + ". We have received your membership form.");
		out.println("<p>You have registered your vehicle: " + e +" " + f + " " + " " + g + " " + "License Plate: " + h + "</p>");
		out.println("<p>You will receive an invoice of the membership on your e-mail: " + d + "</p>");
		out.println("<p>We thank you for choosing our car wash.</p>");
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
