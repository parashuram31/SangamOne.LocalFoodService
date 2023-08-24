package com.SangamOne.LFS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.SangamOne.LFS.Model.OrderProduct;

import jakarta.transaction.Transactional;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {

	@Query(value="update order_product set quantity=quantity-?2 where product_id=?1", nativeQuery = true)
	void updateOrderProductCount(int product_id, int quantity);

	/*@Modifying
	@Transactional
	@Query(value="delete from order_product where company_id=:company_id and house_id=:house_id and product_id=:product_id", nativeQuery = true)
	public void deleteOrderProduct(int company_id, int house_id, int product_id);*/

	@Transactional
	@Modifying
	@Query(value="update product set quantity=quantity-:quantity where product_id=:product_id and quantity>=:quantity", nativeQuery=true)
	int updateProductCount(@Param("quantity") int quantity, @Param("product_id")int product_id);
}
