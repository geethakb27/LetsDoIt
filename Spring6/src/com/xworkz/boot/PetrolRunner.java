package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bean.PetrolBunk;
import com.xworkz.configuration.SpringConfiguration;

public class PetrolRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		PetrolBunk shell = container.getBean(PetrolBunk.class);
		shell.purchase();

	}
}
