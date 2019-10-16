package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int num1=Integer.parseInt(request.getParameter("n1"));
	int num2=Integer.parseInt(request.getParameter("n2"));
	
	request.setAttribute("num01",num1);
	request.setAttribute("num02",num2);
	
	RequestDispatcher rd=request.getRequestDispatcher("addServlet2");
	rd.include(request, response);
	/*int n3=num1+num2;
	PrintWriter out=response.getWriter();

	out.println(n3);*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
