package org.project.companies.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.companies.DAO.AccountDetailsDAO;
import org.project.companies.model.Account;


@WebServlet("/register")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AccountDetailsDAO accountDetailsDAO = new AccountDetailsDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Call DAO method to get list of accounts
		//List<AccountDetails> list = testCompaniesDAO.get();
		
		//Add the accounts to request object
		//request.setAttribute("list", list);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Get dispatcher
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/Form1.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/accountregister.jsp");
		//Forward the req and res objects
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		System.out.println("firstName"+firstName);
		System.out.println("lastName"+lastName);
		System.out.println("email"+email);
		
		Account account = new Account();
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setUsername(username);
		account.setPassword(password);
		account.setPhone(phone);
		account.setEmail(email);
		
		try {
			accountDetailsDAO.registerAccountDetails(account);
			//accountDetailsDAO.registerAccountDetails(accountDetails);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("Login.jsp");
		
	}
	
}
