package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Experience {
		@Autowired
		private Experience experience;

		public Experience() {
			System.out.println("Created Experience using no-arg const");
		}
	}


