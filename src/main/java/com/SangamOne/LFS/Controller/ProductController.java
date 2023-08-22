package com.SangamOne.LFS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.LFS.Model.Product;
import com.SangamOne.LFS.Repository.ProductRepository;

@RestController
@RequestMapping(value="product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return "Inserte";
	}
	
	@GetMapping("/viewProduct")
	public List<Product> viewAllHouse() {
		return productRepository.findAll();
	}
	
	@GetMapping("/viewProductByCompanyId/{company_id}")
	public List<Product> getProducts(@PathVariable int company_id){
		return productRepository.getProducts(company_id);
	}
	
	@GetMapping("/getProductsByCompanyId&houseId/{company_id}/{house_id}")
	public List<Product> getProducts1(@PathVariable int company_id, @PathVariable int house_id){
		return productRepository.findByProducts1(company_id, house_id);
	}
	
	/*@GetMapping("/getHouseByCompanyId&houseNumber/{company_id}/{house_number}")
	public List<Product> getProducts2(@PathVariable int company_id, @PathVariable String house_number){
		return productRepository.findByProducts2(company_id, house_number);
	}*/
	
	
}
