package org.project.companies.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.project.companies.DAO.AccountDetailsDAO;
import org.project.companies.model.Account;

@WebServlet("/register")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Creating accountDetailsDAO object to allow the servlet to use the methods
	// from that class which interact with the database
	private AccountDetailsDAO accountDetailsDAO = new AccountDetailsDAO();

	// Displaying accountregister.jsp when path /register is visited
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Add the accounts to request object
		response.getWriter().append("Served at: ").append(request.getContextPath());

		// Get dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/accountregister.jsp");
		// Forward the req and res objects
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// Takes in the details entered in the register account form, then writing that
	// to the database
	// Once that is successfully done the web application is redirected to the
	// Company list page
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		System.out.println("firstName" + firstName);
		System.out.println("lastName" + lastName);
		System.out.println("email" + email);

		Account account = new Account();
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setUsername(username);
		account.setPassword(password);
		account.setPhone(phone);
		account.setEmail(email);

		try {
			accountDetailsDAO.registerAccountDetails(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/CompanyUnite/ModifyCompanyList");

	}
}
