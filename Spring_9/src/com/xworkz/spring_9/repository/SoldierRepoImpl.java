package com.xworkz.spring_9.repository;

import com.xworkz.spring_9.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	public SoldierRepoImpl() {
		System.out.println("Creating SoldierRepoImpl using no arg const");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("Dto is passed " + dto);
		return false;
	}

}
