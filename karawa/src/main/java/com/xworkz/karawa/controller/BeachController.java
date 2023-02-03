package com.xworkz.karawa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.karwar.dto.BeachDTO;

@Component
@RequestMapping("/foreighners")
public class BeachController {

	public BeachController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onBeach(BeachDTO beachDTO, Model model) {
		model.addAttribute("beachName", beachDTO.getBeachName());
		model.addAttribute("location", beachDTO.getLocation());
		model.addAttribute("clean", beachDTO.isClean());
		model.addAttribute("gameType", beachDTO.getGameType());
		System.out.println("Running onBeach: " + beachDTO);
		return "BeachSuccess.jsp";
	}

}