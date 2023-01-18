package com.xworkz.spring4.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring4.bean.Sanke;
import com.xworkz.spring4.configuration.SnakeConfiguration;

public class SnakeRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SnakeConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Sanke sn = container.getBean(Sanke.class);
		System.out.println(sn);
	}
}
