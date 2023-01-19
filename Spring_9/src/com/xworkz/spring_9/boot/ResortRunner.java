package com.xworkz.spring_9.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring_9.configuration.SoliderConfiguration;
import com.xworkz.spring_9.dto.ResortDTO;
import com.xworkz.spring_9.service.ResortService;



public class ResortRunner
{
	public static void main(String[] args) {
		
		

		ApplicationContext container = new AnnotationConfigApplicationContext(SoliderConfiguration.class);
		ResortService service = container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDTO());
		System.out.println("saved " + saved);
	}
}
