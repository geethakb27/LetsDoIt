package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.bean.Actor;
import com.xworkz.spring2.bean.Rocket;
import com.xworkz.spring2.bean.Season;
import com.xworkz.spring2.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Rocket refOfRocket = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());

		Rocket refOfRocket1 = container.getBean("fly", Rocket.class);
		System.out.println(refOfRocket1);
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getBudget());

		Actor refActor = container.getBean("actor", Actor.class);
		System.out.println(refActor);
		System.out.println(refActor.getName());
		System.out.println(refActor.getLanguage());
		System.out.println(refActor.getAge());

		Actor refActor1 = container.getBean("comedy", Actor.class);
		System.out.println(refActor1);
		System.out.println(refActor1.getName());
		System.out.println(refActor1.getLanguage());
		System.out.println(refActor1.getAge());

		Season refOfSeason = container.getBean("season", Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getStartingMonth());

		Season refOfSeason1 = container.getBean("cold", Season.class);
		System.out.println(refOfSeason1);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getDuration());
		System.out.println(refOfSeason1.getStartingMonth());
	}

}
