package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration 
{

	public SpringConfiguration()
	{
		System.out.println("spring configuration");
		}
}
