package com.SangamOne.LFS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.LFS.Model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

   // public Company getCompanies(int companyId);

	//public Company viewCompanies(String companyName);  

}
