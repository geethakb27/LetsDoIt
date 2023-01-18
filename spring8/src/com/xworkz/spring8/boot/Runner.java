package com.xworkz.spring8.boot;

import com.xworkz.spring8.dto.TerroristDTO;
import com.xworkz.spring8.service.TerroristService;
import com.xworkz.spring8.service.TerrorsitServiceImpl;

public class Runner {
	public static void main(String[] args) 
	{
		TerroristDTO terroristDTO = new TerroristDTO();
		terroristDTO.setName("Neer");
		terroristDTO.setAge(23);
		terroristDTO.setCountry("Pakistan");
		terroristDTO.setOrganization("ISI");
		System.out.println(terroristDTO);

		TerroristService service = new TerrorsitServiceImpl();
		service.validateAndSave(terroristDTO);	
	}

}
