package com.xworkz.aeroplane.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AeroplaneInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	
	public AeroplaneInit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] ref = { AeroplaneConfiguration.class };
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
		System.out.println("configureDefaultServletHandling");
		configurer.enable();
	}
}


