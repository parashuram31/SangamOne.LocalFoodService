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

import jakarta.persistence.criteria.Order;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value="/OrderProduct")
public class OrderProductController {

	@Autowired
	OrderProductRepository orderProductRepository;
	
	/*@PostMapping("/addOrderProduct")
	public String addOrderProduct(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.save(orderProduct);
		return "Inserted";
	}
	*/
	@GetMapping("/viewOrderProduct")
	public List<OrderProduct> viewOrderProduct(){
		return orderProductRepository.findAll();
	}
	
	@PutMapping("/cancelOrderProduct")
	public String cancelOrderProduct(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.save(orderProduct);
		return "Cancelled";
	}
	
	@PutMapping("/updateOrderProductQuantity")
	public String updateOrderProducQuantityt(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.save(orderProduct);
		return "Updated";
	}
	
	@PutMapping("/updateOrderProductCount")
	public String updateOrderProductCount(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.updateOrderProductCount(orderProduct.getProduct_id(), orderProduct.getQuantity());
		return "Updated";
	}
	
	@Transactional
	@PostMapping("/orderProduct")
	public String orderProduct(@RequestBody OrderProduct orderProduct) {
		
		int flag=orderProductRepository.updateProductCount(orderProduct.getQuantity(), orderProduct.getProduct_id());
		if(flag>0) {
			orderProductRepository.save(orderProduct);
			return "Order Placed";
		}else {
			return "Order Not Placed";
		}
	}
}
