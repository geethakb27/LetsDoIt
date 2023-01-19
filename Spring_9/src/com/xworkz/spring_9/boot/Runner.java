package com.xworkz.spring_9.boot;

import com.xworkz.spring_9.dto.SoldierDTO;
import com.xworkz.spring_9.repository.SoldierRepo;
import com.xworkz.spring_9.repository.SoldierRepoImpl;
import com.xworkz.spring_9.service.SoliderServiceImpl;

public class Runner {
	public static void main(String[] args) 
	{
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
