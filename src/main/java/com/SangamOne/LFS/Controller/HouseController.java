package com.SangamOne.LFS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.LFS.Model.House;
import com.SangamOne.LFS.Repository.HouseRepository;

@RestController
@RequestMapping(value="/house")
public class HouseController {

	@Autowired
	HouseRepository houseRepository;
	
	@GetMapping("/viewHouse")
	public List<House>getAllCompanies(){
		return houseRepository.findAll();
	}
}
