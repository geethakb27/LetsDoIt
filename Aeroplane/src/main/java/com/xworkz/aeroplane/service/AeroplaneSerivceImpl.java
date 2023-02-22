package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepository;

@Service
public class AeroplaneSerivceImpl implements AeroplaneService {
	@Autowired
	private AeroplaneRepository aeroplaneRepository;

	public AeroplaneSerivceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		System.out.println("running validate and save in AeroplaneSerivceImpl " + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations is not there in dto , can save");

			return violations;
		} else

			System.out.println("voliation in dto");

		AeroplaneEntity entity = new AeroplaneEntity();

		entity.setName(dto.getName());
		entity.setCompany(dto.getCompany());
		entity.setCost(dto.getCost());
		entity.setTypes(dto.getTypes());
		entity.setCountries(dto.getCountries());
		boolean saved = this.aeroplaneRepository.save(entity);
		System.out.println("Saved:" + saved);

		return Collections.emptySet();

	}

	@Override
	public AeroplaneDTO findById(int id) {

		if (id > 0) {
			AeroplaneEntity entity = this.aeroplaneRepository.findById(id);

			if (entity != null) {
				System.out.println("Entity is found " + id);

				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setTypes(entity.getTypes());
				dto.setCountries(entity.getCountries());
				return dto;

			}
		}
		return AeroplaneService.super.findById(id);
	}
}
