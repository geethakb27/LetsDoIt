package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watches {
	 		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String name1="Fire Boult";
			String name2="Casio";
			String name3="I watch";
			String name4="Fast-Track";
			String name5="Sonato";
			
			Collection<String>watch=new ArrayList<String>();
			watch.add(name1);
			watch.add(name2);
			watch.add(name3);
			watch.add(name4);
			watch.add(name5);
			
			System.out.println("======foreach=====");
			for(String element : watch)
			{
				System.out.println(element);
			}
			System.out.println("====Iterator=====");
			Iterator <String> itr= watch.iterator();
			while(itr.hasNext())
			{
				String ele=itr.next();
				System.out.println(ele);
			}
			System.out.println("=================");
			System.out.println("size"+watch.size());
			

		}

	}
