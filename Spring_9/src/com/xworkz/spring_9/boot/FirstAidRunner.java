package com.xworkz.spring_9.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring_9.configuration.SoliderConfiguration;
import com.xworkz.spring_9.dto.FirstAidDTO;
import com.xworkz.spring_9.service.FirstAidService;

public class FirstAidRunner  {
	
	public static void main(String[] args) {
		
	

			ApplicationContext container = new AnnotationConfigApplicationContext(SoliderConfiguration.class);
			FirstAidService service = container.getBean(FirstAidService.class);
			boolean saved = service.validateAndSave(new FirstAidDTO());
			System.out.println("saved " + saved);
		}
	}


