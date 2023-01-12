package com.xworkz.spring4.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring4.bean.Engine;
import com.xworkz.spring4.configuration.EngineConfiguration;

public class EngineRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(EngineConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Engine en = container.getBean(Engine.class);
		System.out.println(en);
	}
}
