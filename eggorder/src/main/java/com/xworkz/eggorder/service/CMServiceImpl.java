package com.xworkz.eggorder.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.eggorder.dto.CMDTO;

@Service
public class CMServiceImpl implements CMSerivce {

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto) {

		System.out.println("running validateAndSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> contraintsViolations = validator.validate(dto);

		if (contraintsViolations != null && !contraintsViolations.isEmpty()) {
			System.err.println("ContraintsViolation exist retrurn Constraintsviolation ");
			return contraintsViolations;

		} else {
			System.out.println(" ContraintsViolation dose not exist, data is good");
		}
		return Collections.emptySet();
	}

}
