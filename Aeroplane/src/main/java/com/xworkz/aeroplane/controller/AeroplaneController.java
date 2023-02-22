package com.xworkz.aeroplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;


@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;

	private List<String> types = Arrays.asList("Business jet", "Cargo aircraft", "Glider", "Airliner",
			"Fighter aircraft", "Airbus A330");
	private List<String> countries = Arrays.asList("India", "Australia", "England", "America", "Uganda", "Pakistan",
			"New zealand");

	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/aeroplane")
	public String onAeroplane(Model model) {
		System.out.println("Running onAeroplane Get method");
		List<String> types = Arrays.asList("Business jet", "Cargo aircraft", "Glider", "Airliner", "Fighter aircraft",
				"Airbus A330");
		List<String> countries = Arrays.asList("India", "Australia", "England", "America", "Uganda", "Pakistan",
				"New zealand");
		model.addAttribute("types", types);
		model.addAttribute("countries", countries);
		return "Areoplane";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		AeroplaneDTO dto = this.aeroplaneService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "AeroplaneSearch";
	}

	@PostMapping("/aeroplane")
	public String onAeroplane(Model model, AeroplaneDTO dto) {
		System.out.println("Running onAeroplane Post method " + dto);
		Set<ConstraintViolation<AeroplaneDTO>> violations = this.aeroplaneService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to success page");
			return "Areoplane";
		}
		model.addAttribute("types", types);
		model.addAttribute("countries", countries);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "Areoplane";
	}
}