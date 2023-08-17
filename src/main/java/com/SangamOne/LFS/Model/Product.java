package com.SangamOne.LFS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="house_id")
	private int houseId;
	
	
	@Column(name="product_name")
	private String productName;
	
	@ManyToOne
	@JoinColumn(name="company_id", insertable = false, updatable = false)
	private Company company;
	
	@ManyToOne
	@JoinColumn(name="house_id", insertable = false, updatable = false)
	private House house;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	
}
