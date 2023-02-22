


package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.Repository.ValentineRepository;
import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;

@Service
public class ValentineServiceImpl implements ValentineService

{
	@Autowired
	private ValentineRepository  valentineRepository;
	
	public ValentineServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("Running validate and save in ValentineServiceImpl "+dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations is not there in dto , can save");
			
			return violations;
		} else

			System.out.println("voliation in dto");
		
		ValentineEntity entity = new ValentineEntity();
		
		entity.setName(dto.getName());
		entity.setValentineName(dto.getValentineName());
		entity.setPlaces(dto.getPlaces());
		entity.setGifts(dto.getGifts());
		boolean saved = this.valentineRepository.save(entity);
		
		
		return Collections.emptySet();

	}
	
	
	@Override
	public ValentineDTO findById(int id) {
		// TODO Auto-generated method stub
		
		if(id>0) {
			ValentineEntity entity=this.valentineRepository.findById(id);
			
			if(entity!=null) {
				System.out.println("Entity is found "+id);
				
				ValentineDTO dto=new ValentineDTO();
				dto.setName(entity.getName());
				dto.setGifts(entity.getGifts());
				dto.setId(entity.getId());
				dto.setPlaces(entity.getPlaces());
				dto.setValentineName(entity.getValentineName());
				return dto;
				
			}
		}
		return ValentineService.super.findById(id);
	}
}
