package com.xworkz.navya.configiuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class NavyaInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{

	public NavyaInit() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");	
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses ");
		Class[] ref = { NavyaConfiguration.class };
		return ref;

	}
	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String[] ref2 = { "/" };
		System.out.println(Arrays.toString(ref2));
		return ref2;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}