package com.xworkz.spring_9.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring_9.dto.MissileDTO;
import com.xworkz.spring_9.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {
	private MissileRepo missileRepo;
	@Autowired
	private Validator validator;

	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {

		System.out.println("Executing validateAndSave start");
		System.out.println("Dto started" + dto);

		// service.validateAndSave(soldierDTO);

		Set<ConstraintViolation<MissileDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(a -> System.err.println(a.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		boolean saved = missileRepo.save(dto);
		System.out.println(saved);
		return saved;
	}
}
