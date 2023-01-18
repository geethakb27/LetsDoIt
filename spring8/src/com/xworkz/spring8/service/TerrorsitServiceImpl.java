package com.xworkz.spring8.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.spring8.dto.TerroristDTO;

public class TerrorsitServiceImpl implements TerroristService
{
	public void TerroristServiceImpl() 
	{
		System.out.println("Creating TerroristServiceImpl using no-arg const ");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto)
	{
		System.out.println("Executing validateAndSave start");
		System.out.println("Dto started" + dto);

//		Set<ConstraintViolation<TerroristDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator().validate(null, null)
		 
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(a -> System.err.println(a.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		return true;
	}




}
