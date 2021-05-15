package org.project.companies.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.project.companies.DAO.AccountDetailsDAO;
import org.project.companies.model.Account;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDetailsDAO accountDetailsDAO = new AccountDetailsDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// We take in the username and password entered into the login page
	// Comparing them with the database by using our validate method which we can
	// use through our accountDetailsDAO object
	// If the username and password are valid they are brought to the company list
	// JSP else they remain on the Login page
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Account account = new Account();
		account.setUsername(username);
		account.setPassword(password);

		try {
			if (accountDetailsDAO.validate(account)) {
				response.sendRedirect("ModifyCompanyList");
			} else {
				response.sendRedirect("Login.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
