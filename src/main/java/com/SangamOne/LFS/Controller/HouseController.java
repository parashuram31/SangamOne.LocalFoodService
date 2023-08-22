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

import com.SangamOne.LFS.Model.House;
import com.SangamOne.LFS.Repository.HouseRepository;

@RestController
@RequestMapping(value="/house")
public class HouseController {

	@Autowired
	HouseRepository houseRepository;
	
	@PostMapping("/addHouse")
	public String addHouse(@RequestBody House house) {
		houseRepository.save(house);
		return "Inserted";
	}
	
	@GetMapping("/viewHouse")
	public List<House> viewAllHouse() {
		return houseRepository.findAll();
	}
	
	@GetMapping("/viewHousesByCompanyId/{company_id}")
	public List<House> getHouses(@PathVariable int company_id) {
		return houseRepository.findByHouses(company_id);
	}
	
	
	@GetMapping("/getHouseByCompanyId&HouseId/{company_id}/{house_id}")
	public List<House> getByHouses1(@PathVariable int company_id, @PathVariable int house_id) {
		return houseRepository.findByHouse1(company_id, house_id);
	}
	
	@PutMapping("/updateHouse")
	public String updateHouse(@RequestBody House house) {
		houseRepository.save(house);
		return "Updated";
	}
	
	@DeleteMapping("/delete/{company_id}/{house_id}")
	public String deleteByCompanyIdAndHouseId(@PathVariable int company_id, @PathVariable int house_id) {
		houseRepository.deleteByCompanyIdAndHouseId(company_id, house_id);
		return "Deleted";
	}
}
