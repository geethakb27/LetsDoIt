package com.xworkz.eggorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggorder.dto.EggOrderDTO;
import com.xworkz.eggorder.service.EggOrderSerivce;

@Controller
@RequestMapping("/egg")
public class EggOrderController {
	
	
		@Autowired
		private EggOrderSerivce service;

		public EggOrderController() {
			System.out.println("Created" + this.getClass().getSimpleName());
		}

		@PostMapping
		public String onSend(EggOrderDTO dto, Model model) {
			System.out.println("Running onSend " + dto);
			boolean saved = this.service.validateAndSave(dto);
			System.out.println("Saved in controller " + saved);
			return "Home.jsp";
		}
}



