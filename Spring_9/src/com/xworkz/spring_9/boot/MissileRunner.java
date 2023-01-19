package com.xworkz.spring_9.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring_9.configuration.SoliderConfiguration;
import com.xworkz.spring_9.dto.MissileDTO;
import com.xworkz.spring_9.service.MissileService;

public class MissileRunner {
public static void main(String[] args) {
		
		

		ApplicationContext container = new AnnotationConfigApplicationContext(SoliderConfiguration.class);
		MissileService service = container.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println("saved " + saved);
	}

}
