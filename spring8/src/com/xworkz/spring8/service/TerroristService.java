package com.xworkz.spring8.service;

import com.xworkz.spring8.dto.TerroristDTO;

public interface TerroristService
{
	boolean validateAndSave(TerroristDTO dto);
}
