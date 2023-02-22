package com.xworkz.valentine.controller;

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

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;


@Controller
@RequestMapping("/valentine")
public class ValentineController {

	
	@Autowired
	private ValentineService valentineService;
	
	List<String> places=Arrays.asList("cubban park","BTM","lal bagha","jp nagara","indra nagara");
    List<String> gifts=Arrays.asList("cholcolate","teddy","ring","flower","dress");


	public ValentineController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	@GetMapping
	public String onValentine(Model model)
	{
		System.out.println("running on onValentine getmethod");
		 model.addAttribute("places",places);
		 model.addAttribute("gifts",gifts);
		 return "Valentine";

	}
	@PostMapping
	public String onValentine( Model model,ValentineDTO dto)
	{
		System.out.println("Running onValentine : "+dto);
		Set<ConstraintViolation<ValentineDTO>> violations = valentineService.validateAndSave(dto);
         if(violations.isEmpty())
         {
        	 System.out.println("data is valid go to success");
        	 return "ValentineSuccess";
         }
		 model.addAttribute("places",places);
		 model.addAttribute("gifts",gifts);
		 model.addAttribute("errors",violations);
		 model.addAttribute("dto",dto);
		 System.err.println("violation in controller");
		 return "Valentine";
	
	}
	
}
