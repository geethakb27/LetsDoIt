package com.xworkz.spring_9.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring_9.dto.ResortDTO;
import com.xworkz.spring_9.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;

	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {

		System.out.println("Executing validateAndSave start");
		System.out.println("Dto started" + dto);

		// service.validateAndSave(soldierDTO);

		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(a -> System.err.println(a.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		boolean saved = resortRepo.save(dto);
		System.out.println(saved);
		return saved;
	}

}