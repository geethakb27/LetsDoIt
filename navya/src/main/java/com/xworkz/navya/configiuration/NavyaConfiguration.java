package com.xworkz.navya.configiuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.navya")
public class NavyaConfiguration
{
	
	public NavyaConfiguration() 
	{
		System.out.println("Created" + this.getClass().getSimpleName());
	}


}
