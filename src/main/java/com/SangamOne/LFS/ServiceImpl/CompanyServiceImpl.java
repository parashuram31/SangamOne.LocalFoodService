package com.SangamOne.LFS.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SangamOne.LFS.Model.Company;
import com.SangamOne.LFS.Repository.CompanyRepository;
import com.SangamOne.LFS.Service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

}
