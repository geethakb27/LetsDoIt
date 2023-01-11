package com.xworkz.spring3.boot;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring3.bean.Flower;
import com.xworkz.spring3.bean.Hardware;
import com.xworkz.spring3.bean.Pencil;
import com.xworkz.spring3.bean.Rubber;
import com.xworkz.spring3.bean.Software;
import com.xworkz.spring3.bean.SoftwareEngineer;
import com.xworkz.spring3.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] bean = container.getBeanDefinitionNames();

		Hardware hardware = container.getBean(Hardware.class);
		System.out.println(hardware);
		
		Flower yw = container.getBean(Flower.class);
		System.out.println(yw);	

		Rubber rubber = container.getBean(Rubber.class);
		System.out.println(rubber);	

		
		
		Pencil pencil = container.getBean(Pencil.class);
		System.out.println(pencil);	
		
		Software sowftare = container.getBean(Software.class);
		System.out.println(sowftare);	
		
		SoftwareEngineer se = container.getBean(SoftwareEngineer.class);
		System.out.println(se);	
	}

}
