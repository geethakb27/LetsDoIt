package com.xworkz.spring_9.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring_9.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {
	public void ResortRepoImpl() {
		System.out.println("Creating ResortRepoImpl using no arg const");
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save");
		System.out.println("Dto is passed " + dto);
		return false;
	}
}
