package com.SangamOne.LFS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.LFS.Model.OrderProduct;
import com.SangamOne.LFS.Repository.OrderProductRepository;

@RestController
@RequestMapping(value="/OrderProduct")
public class OrderProductController {

	@Autowired
	OrderProductRepository orderProductRepository;
	
	@PostMapping("/addOrderProduct")
	public String addOrderProduct(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.save(orderProduct);
		return "Inserted";
	}
	
	@GetMapping("/viewOrderProduct")
	public List<OrderProduct> viewOrderProduct(){
		return orderProductRepository.findAll();
	}
	
	/*@DeleteMapping("/deleteOrderProduct/{company_id}/{house_id}/{product_id}")
	public String deleteOrderProduct(@PathVariable("company_id") int company_id, @PathVariable("house_id")int house_id, @PathVariable("product_id") int product_id) {
		orderProductRepository.deleteOrderProduct(company_id,house_id,product_id);
		return "Deleted";
	}*/
	
	@PutMapping("/cancelOrderProduct")
	public String cancelOrderProduct(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.save(orderProduct);
		return "Cancelled";
	}
	
	@PutMapping("/updateOrderProductQuantuty")
	public String updateOrderProducQuantityt(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.save(orderProduct);
		return "Updated";
	}
	
}
