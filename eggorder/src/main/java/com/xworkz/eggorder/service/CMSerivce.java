package com.xworkz.eggorder.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.eggorder.dto.CMDTO;

public interface CMSerivce {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto);

}
