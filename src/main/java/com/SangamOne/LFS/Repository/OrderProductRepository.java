package com.SangamOne.LFS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.SangamOne.LFS.Model.OrderProduct;

import jakarta.transaction.Transactional;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {

	/*@Modifying
	@Transactional
	@Query(value="delete from order_product where company_id=:company_id and house_id=:house_id and product_id=:product_id", nativeQuery = true)
	public void deleteOrderProduct(int company_id, int house_id, int product_id);*/

}
