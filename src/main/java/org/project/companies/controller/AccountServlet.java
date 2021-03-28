package org.project.companies.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.companies.DAO.AccountDetailsDAO;
import org.project.companies.DAO.TestCompaniesDAO;
import org.project.companies.DAO.TestCompaniesDAOImpl;
import org.project.companies.model.AccountDetails;



public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	//Create a ref variable for account DAO
	TestCompaniesDAO testCompaniesDAO = null;
	
	//Create constructor and initialize employee DAO
	public AccountServlet() {
		testCompaniesDAO = new TestCompaniesDAOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Call DAO method to get list of accounts
		List<AccountDetails> list = testCompaniesDAO.get();
		
		//Add the accounts to request object
		request.setAttribute("list", list);
		
		
		//Get dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Form1.jsp");
		
		//Forward the req and res objects
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
//		String firstname = request.getParameter("firstname");
//		String lastname = request.getParameter("lastname");
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		String address = request.getParameter("address");
//		String contact = request.getParameter("contact");
//		
//		System.out.println("firstName"+firstname);
//		System.out.println("lastName"+lastname);
//		System.out.println("contact"+contact);
//		
		/*
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.setFirstName(firstName);
		accountDetails.setLastName(lastName);
		accountDetails.setUsername(username);
		accountDetails.setPassword(password);
		accountDetails.setAddress(address);
		accountDetails.setContact(contact);
		
		try {
			accountDetailsDAO.registerAccountDetails(accountDetails);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("Details.jsp");
		*/
	}
	
}
