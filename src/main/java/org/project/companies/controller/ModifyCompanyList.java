package org.project.companies.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.project.companies.DAO.UpdateCompanyDAO;
import org.project.companies.model.Company;
import javax.servlet.annotation.WebServlet;

/*
 * Title: JSP Servlet JDBC MySQL CRUD Example Tutorial | Java Guides
 * Author: Java Guides
 * Date: Jan 26, 2020
 * Code version: 1.0
 * Availablity: https://www.youtube.com/watch?v=RqiuxA_OFOk
 * 
 */

@WebServlet("/")
public class ModifyCompanyList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// object allows us to interact with the methods that interact with the database
	// object is used to allow us to add, update and delete from the database
	// through the servlet
	private UpdateCompanyDAO updateCompanyDAO;

	public void init() {
		updateCompanyDAO = new UpdateCompanyDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

	// switch statement takes in different action which are available through our
	// JSP files
	// depending on the action taken the corresponding method will be executed
	// Methods below are developed for showing different forms, add companies,
	// deleting companies and updating companies.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertCompany(request, response);
				break;
			case "/delete":
				deleteCompany(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateCompany(request, response);
				break;
			default:
				listCompanies(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}

	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("companyForm.jsp");
		dispatcher.forward(request, response);
	}

	private void insertCompany(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		String companyName = request.getParameter("companyName");
		String address = request.getParameter("address");
		String postcode = request.getParameter("postcode");
		String sector = request.getParameter("sector");
		String details = request.getParameter("details");
		Company newCompany = new Company(companyName, address, postcode, sector, details);
		updateCompanyDAO.insertCompany(newCompany);
		response.sendRedirect("list");
	}

	private void deleteCompany(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		updateCompanyDAO.deleteCompany(companyId);
		response.sendRedirect("list");
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		Company existingCompany = updateCompanyDAO.selectCompany(companyId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("companyForm.jsp");
		request.setAttribute("company", existingCompany);
		dispatcher.forward(request, response);
	}

	private void updateCompany(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int companyId = Integer.parseInt(request.getParameter("companyId"));
		String companyName = request.getParameter("companyName");
		String address = request.getParameter("address");
		String postcode = request.getParameter("postcode");
		String sector = request.getParameter("sector");
		String details = request.getParameter("details");

		Company updateCompany = new Company(companyId, companyName, address, postcode, sector, details);
		updateCompanyDAO.updateCompany(updateCompany);
		response.sendRedirect("list");
	}

	private void listCompanies(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Company> listCompanies = updateCompanyDAO.selectAllCompanies();
		request.setAttribute("listCompanies", listCompanies);
		RequestDispatcher dispatcher = request.getRequestDispatcher("modifyCompanyList.jsp");
		dispatcher.forward(request, response);
	}
}
