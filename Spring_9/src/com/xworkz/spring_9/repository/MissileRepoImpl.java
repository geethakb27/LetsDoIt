package com.xworkz.spring_9.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring_9.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepo {
	public MissileRepoImpl() {
		System.out.println("Creating MissileRepoImpl using no arg const");
	}

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Running save");
		System.out.println("Dto is passed " + dto);
		return false;
	}

}
