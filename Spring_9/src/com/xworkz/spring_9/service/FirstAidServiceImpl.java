package com.xworkz.spring_9.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring_9.dto.FirstAidDTO;
import com.xworkz.spring_9.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	private FirstAidRepo firstAidRepo;
	@Autowired
	private Validator validator;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {

		System.out.println("Executing validateAndSave start");
		System.out.println("Dto started" + dto);

		// service.validateAndSave(soldierDTO);
		Set<ConstraintViolation<FirstAidDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(a -> System.err.println(a.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		boolean saved = firstAidRepo.save(dto);
		System.out.println(saved);
		return saved;
	}
}
