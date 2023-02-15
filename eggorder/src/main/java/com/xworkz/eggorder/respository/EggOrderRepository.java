package com.xworkz.eggorder.respository;

import com.xworkz.eggorder.dto.EggOrderDTO;

public interface EggOrderRepository {

	
	boolean save(EggOrderDTO dto);
}
