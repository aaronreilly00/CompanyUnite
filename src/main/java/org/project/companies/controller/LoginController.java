package org.project.companies.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.project.companies.DAO.AccountDetailsDAO;
import org.project.companies.model.Account;


@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDetailsDAO accountDetailsDAO = new AccountDetailsDAO();
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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