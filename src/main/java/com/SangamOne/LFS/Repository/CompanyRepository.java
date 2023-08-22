package com.SangamOne.LFS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SangamOne.LFS.Model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

	@Query(value="select * from company where company_id=?1", nativeQuery = true)
	List<Company> findByCompany(int company_id); 

}
