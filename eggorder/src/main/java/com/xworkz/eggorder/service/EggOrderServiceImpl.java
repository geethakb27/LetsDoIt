package com.xworkz.eggorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.eggorder.dto.EggOrderDTO;
import com.xworkz.eggorder.respository.EggOrderRepository;

@Service
public class EggOrderServiceImpl implements EggOrderSerivce {
	
	@Autowired
	private EggOrderRepository  eggRepository;
	
	public EggOrderServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	
	
	@Override
	public boolean validateAndSave(EggOrderDTO dto) {
		System.out.println("Running validateAndSave " + dto);
		boolean saved = this.eggRepository.save(dto);
		System.out.println("Saved in service " + saved);
		return false;
	}
	


}


	