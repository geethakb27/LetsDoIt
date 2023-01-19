package com.xworkz.spring_9.repository;

import com.xworkz.spring_9.dto.SoldierDTO;

public interface SoldierRepo {

	boolean save(SoldierDTO dto);
}
