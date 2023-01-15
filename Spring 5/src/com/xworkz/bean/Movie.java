package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Movie {
		@Autowired
		private Director director;
		@Autowired
		private CameraMan cameraMan;
		@Autowired
		private Producer producer;

		public Movie() {
			System.out.println("Created Movie using no-arg const");
		}
	}
