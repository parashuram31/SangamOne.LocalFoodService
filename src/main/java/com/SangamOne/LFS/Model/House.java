package com.SangamOne.LFS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class House {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name="house_id")
	private int houseId;
	
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="house_number")
	private String houseNumber;
	
	@Column(name="house_address")
	private String houseAddress;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	@ManyToOne
	@JoinColumn(name="company_id", insertable = false, updatable = false)
	private Company company;

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
