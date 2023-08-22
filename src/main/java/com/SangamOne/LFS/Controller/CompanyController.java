package com.SangamOne.LFS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.LFS.Model.Company;
import com.SangamOne.LFS.Repository.CompanyRepository;

@RestController
@RequestMapping(value="/company")
public class CompanyController {

	@Autowired
	CompanyRepository companyRepository;
	
	@PostMapping("/addCompany")
	public String addCompany(@RequestBody Company company) {
		companyRepository.save(company);
		return "Inserted";
	}
	
	@GetMapping("/viewCompany")
	public List<Company> viewAllCompany() {
		return companyRepository.findAll();
	}
	
	@GetMapping("/{company_id}")
	public Company getCompany(@PathVariable("company_id") int company_id) {
		return companyRepository.findById(company_id).get();
	}
	
	@GetMapping("/getCompanyByCompanyId/{company_id}")
	public List<Company> getByCompany(@PathVariable int company_id) {
		return companyRepository.findByCompany(company_id);
	}

	@DeleteMapping("/delete/{company_id}")
	public String deleteById(@PathVariable("company_id") int company_id) {
		companyRepository.deleteById(company_id);
		return "Deleted";
	}
	
}
