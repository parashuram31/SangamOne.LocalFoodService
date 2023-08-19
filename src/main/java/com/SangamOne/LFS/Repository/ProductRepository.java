package com.SangamOne.LFS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.SangamOne.LFS.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value = "select * from product where company_id=:company_id", nativeQuery = true)
	List<Product> getProducts(@Param("company_id") int company_id);
	
	@Query(value = "select * from product where company_id=:company_id and house_id=:house_id", nativeQuery = true)
	//List<Product> findByProducts1(@Param ("company_id") int company_id,@Param("house_id") int house_id);
    List<Product> findByProducts1(int company_id, int house_id);
	
	/*@Query(value = "select * from product where company_id=:company_id and house_number=:house_number", nativeQuery = true)
    List<Product> findByProducts2(@Param("company_id") int company_id, @Param ("house_number") String house_number);*/
}
