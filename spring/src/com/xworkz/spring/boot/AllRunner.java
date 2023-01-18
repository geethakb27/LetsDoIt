package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.BhashyamCircle;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.GOd;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class AllRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		BhashyamCircle ref = spring.getBean(BhashyamCircle.class);
		System.out.println(ref);
		
		Area ref1 = spring.getBean(Area.class);
		System.out.println(ref1);
		
		Girl ref2 = spring.getBean(Girl.class);
		System.out.println(ref2);
		
		Temple ref3 = spring.getBean(Temple.class);
		System.out.println(ref3);
		
		Bus ref4 = spring.getBean(Bus.class);
		System.out.println(ref4);
		
		Fish ref5 = spring.getBean(Fish.class);
		System.out.println(ref5);
		
		Milk ref6 = spring.getBean(Milk.class);
		System.out.println(ref6);
		
		Road r = spring.getBean(Road.class);
		System.out.println(r);
		
		Application ref7 = spring.getBean(Application.class);
		System.out.println(ref7);
		
		Chocolate ref8 = spring.getBean(Chocolate.class);
		System.out.println(ref8);
		
		Mall ref9 = spring.getBean(Mall.class);
		System.out.println(ref9);
		
		Patient p = spring.getBean(Patient.class);
		System.out.println("p");
		
		City ci = spring.getBean(City.class);
		System.out.println(ci);
		
	    Park pa = spring.getBean(Park.class);
	    System.out.println(pa);
	    
	    Mask m = spring.getBean(Mask.class);
	    System.out.println(m);
	    
	    GOd g =spring.getBean(GOd.class);
	    System.out.println(g);
	    
	    Cycle c = spring.getBean(Cycle.class);
	    System.out.println(c);
		
	}

}
