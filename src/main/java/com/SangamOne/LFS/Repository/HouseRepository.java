package com.SangamOne.LFS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.SangamOne.LFS.Model.House;

public interface HouseRepository extends JpaRepository<House, Integer>{

	@Query(value = "select * from house where company_id=:company_id", nativeQuery = true)
	List<House> findByHouses(@Param("company_id") int company_id);
	

	@Query(value = "select * from house where company_id=:company_id and house_id=:house_id", nativeQuery = true)
	//List<House> findByHouse1(int company_id,int house_id);
	List<House> findByHouse1(@Param("company_id") int company_id, @Param("house_id") int house_id);

	@Modifying
	@Transactional
	@Query(value = "delete from houses where company_id=:company_id and house_id=:house_id", nativeQuery = true)
	void deleteByCompanyIdAndHouseId(int company_id, int house_id);
}
