package com.xworkz.boot;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repository.SoldierRepo;
import com.xworkz.repository.SoldierRepoImpl;
import com.xworkz.service.SoliderServiceImpl;

public class Runner {
	public static void main(String[] args) {
		SoldierDTO soldierDTO = new SoldierDTO();
		soldierDTO.setId(15);
		soldierDTO.setName("akash");
		soldierDTO.setRank("topper");
		soldierDTO.setBetallion("American");
		soldierDTO.setCountry("India");
		System.out.println(soldierDTO);

		SoliderServiceImpl service = new SoliderServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(soldierDTO);
	}
}
