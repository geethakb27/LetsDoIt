package com.xworkz.spring4.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring4.bean.Ghost;
import com.xworkz.spring4.configuration.GhostConfiguration;

public class GhostRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Ghost refghost = container.getBean(Ghost.class);
		System.out.println(refghost);
	}

}
