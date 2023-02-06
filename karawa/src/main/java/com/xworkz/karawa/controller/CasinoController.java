package com.xworkz.karawa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.karawa.dto.CasinoDTO;

@Component
@RequestMapping("/juice")
public class CasinoController {

	public CasinoController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onCasino(CasinoDTO casinoDTO, Model model) {

		System.out.println("Running onCasino: " + casinoDTO);
		model.addAttribute("casinoName", casinoDTO.getCasinoName());
		model.addAttribute("cruiseName", casinoDTO.getCruiseName());
		model.addAttribute("entryFee", casinoDTO.getEntryFee());
		model.addAttribute("freeFood", casinoDTO.isFreeFood());
		model.addAttribute("freeAlcohol", casinoDTO.isFreeAlcohol());
		return "CasinoSuccess.jsp";
	}

}
