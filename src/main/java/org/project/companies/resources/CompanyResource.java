package org.project.companies.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.project.companies.model.Company;
import org.project.companies.services.CompanyService;

@Path("/project/companies")
public class CompanyResource {
	CompanyService service = new CompanyService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> getCompany() {
		List<Company> list = service.getCompany();
		return list;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postCompany(Company company) {
		service.addCompany(company);
	}
	
	@PUT
	@Path("/{companyId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putCompany(@PathParam("companyId") int companyId, Company updatedCompany) {
		updatedCompany.setCompanyId(companyId);
		service.updateCompany(updatedCompany);
	}
	
	@DELETE
	@Path("/{companyId}")
	public void deleteCompany(@PathParam("companyId") int companyId) {
		service.deleteCompany(companyId);
	}
	
	
}
