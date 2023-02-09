package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository {

	public BakeryRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running save in BakeryRepositoryImpl");
		return false;
	}

}