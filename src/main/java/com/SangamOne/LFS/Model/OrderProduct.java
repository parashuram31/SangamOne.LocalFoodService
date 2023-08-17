package com.SangamOne.LFS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderProduct {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name="order_product_id")
	private int orderProductId;
	
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="house_id")
	private int houseId;
	
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="product_id")
	private int productId;
	
	@ManyToOne
	@JoinColumn(name="company_id", insertable = false, updatable = false)
	private Company company;
	
	@ManyToOne
	@JoinColumn(name="house_id", insertable = false, updatable = false)
	private House house;
	
	@ManyToOne
	@JoinColumn(name="product_id", insertable = false, updatable = false)
	private Product product;

	public int getOrderProductId() {
		return orderProductId;
	}

	public void setOrderProductId(int orderProductId) {
		this.orderProductId = orderProductId;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
