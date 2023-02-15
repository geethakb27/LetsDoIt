package com.xworkz.eggorder.service;

import com.xworkz.eggorder.dto.EggOrderDTO;

public interface EggOrderSerivce {
	
	boolean validateAndSave(EggOrderDTO dto);
}
