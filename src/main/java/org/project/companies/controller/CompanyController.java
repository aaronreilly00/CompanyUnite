package org.project.companies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.companies.model.Company;


/**
 * Servlet implementation class CompanyController
 */
public class CompanyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Company comp = new Company();
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/company-list.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
		String data = comp.getCompanyName();
	
		request.setAttribute("DATA", data);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
