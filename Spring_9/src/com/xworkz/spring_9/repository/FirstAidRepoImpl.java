package com.xworkz.spring_9.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring_9.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo {
	public FirstAidRepoImpl() {
		System.out.println("Creating FirstAidRepoImpl using no arg const");
	}

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save");
		System.out.println("Dto is passed " + dto);
		return false;
	}
}
