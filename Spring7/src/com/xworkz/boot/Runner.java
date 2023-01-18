package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.Chrome;
import com.xworkz.bean.FireBox;
import com.xworkz.configuration.SpringConfiguration;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Chrome chrome = container.getBean(Chrome.class);
		chrome.browse();

		FireBox fireBox = container.getBean(FireBox.class);
		fireBox.browse();
	}
}
