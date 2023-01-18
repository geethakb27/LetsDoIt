package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Director {
		@Autowired
		private Experience experience;

		public Director() {
			System.out.println("Created Director using no-arg const");
		}
	}
