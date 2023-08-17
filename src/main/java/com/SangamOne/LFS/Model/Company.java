package com.SangamOne.LFS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="company_name")
	private String companyNmae;
	
	@Column(name="company_loc")
	private String companyLoc;
	
	@Column(name="company_pincode")
	private String companyPincode;
	
	@Column(name="company_country_code")
	private String companyCountryCode;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNmae() {
		return companyNmae;
	}

	public void setCompanyNmae(String companyNmae) {
		this.companyNmae = companyNmae;
	}

	public String getCompanyLoc() {
		return companyLoc;
	}

	public void setCompanyLoc(String companyLoc) {
		this.companyLoc = companyLoc;
	}

	public String getCompanyPincode() {
		return companyPincode;
	}

	public void setCompanyPincode(String companyPincode) {
		this.companyPincode = companyPincode;
	}

	public String getCompanyCountryCode() {
		return companyCountryCode;
	}

	public void setCompanyCountryCode(String companyCountryCode) {
		this.companyCountryCode = companyCountryCode;
	}
	
	
}
