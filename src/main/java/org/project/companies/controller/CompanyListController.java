package org.project.companies.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.companies.DAO.CompanyListDAO;
import org.project.companies.DAO.CompanyListDAOImpl;
import org.project.companies.model.Company;

public class CompanyListController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	// Create a ref variable for account DAO
	CompanyListDAO companyListDAO = null;

	// Create constructor and initialize employee DAO
	public CompanyListController() {
		companyListDAO = new CompanyListDAOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Call DAO method to get list of accounts
		List<Company> list = companyListDAO.get();

		// Add the accounts to request object
		request.setAttribute("list", list);

		// Get dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/companyList.jsp");

		// Forward the req and res objects
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}