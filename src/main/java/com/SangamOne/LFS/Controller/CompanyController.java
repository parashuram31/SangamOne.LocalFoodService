package com.SangamOne.LFS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.LFS.Model.Company;
import com.SangamOne.LFS.Repository.CompanyRepository;
import com.SangamOne.LFS.Service.CompanyService;

@RestController
@RequestMapping(value="/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	/* @GetMapping
	public List<Company>viewAllCompanies(){
		return companyService.getAllCompanies();
	}*/
	
	/*@GetMapping("{companyId}")
	public Company getCompanies(@PathVariable("companyId")int companyId) {
		return companyService.getAllCompanies(companyId);
	}*/
	
	/*@GetMapping("{companyName}")
	public Company viewCompanies(@PathVariable("companyName")String companyName) {
		return companyRepository.viewCompanies(companyName);
	}   */
}
