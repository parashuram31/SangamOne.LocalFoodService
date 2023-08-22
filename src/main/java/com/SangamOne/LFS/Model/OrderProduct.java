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
	
	@Column
	private int order_product_id;
	@Column
	private int company_id;
	@Column
	private int house_id;
	@Column
	private int product_id;
	@Column
	private String quantity;
	
	@ManyToOne
	@JoinColumn(name="company_id", insertable = false, updatable = false)
	private Company company;
	
	@ManyToOne
	@JoinColumn(name="house_id", insertable = false, updatable = false)
	private House house;
	
	@ManyToOne
	@JoinColumn(name="product_id", insertable = false, updatable = false)
	private Product product;

	public int getOrder_product_id() {
		return order_product_id;
	}

	public void setOrder_product_id(int order_product_id) {
		this.order_product_id = order_product_id;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
