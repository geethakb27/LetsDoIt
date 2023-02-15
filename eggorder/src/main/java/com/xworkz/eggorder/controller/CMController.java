package com.xworkz.eggorder.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggorder.dto.CMDTO;
import com.xworkz.eggorder.service.CMSerivce;

@Controller
@RequestMapping("/cm")
public class CMController {
	@Autowired
	private CMSerivce cmSerivce;

	public CMController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCM(CMDTO dto, Model model) {
		System.out.println("running on CM " + dto);
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmSerivce.validateAndSave(dto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("Validation is failed check the erros..");
			constraintViolations.forEach((cv)->System.out.println(cv.getMessage()));
		}else {
			System.out.println("Validation is succefully done,Display the data..");
		}
		return "CMHome.jsp";
	}
}
