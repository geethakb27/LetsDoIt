package com.xworkz.spring_9.service;

import com.xworkz.spring_9.dto.ResortDTO;

public interface ResortService {
	
	boolean validateAndSave(ResortDTO dto);
}
