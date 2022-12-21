package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals
 {

		public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					String name1="Rabbit";
					String name2="Deer";
					String name3="Giraffee";
					String name4="Bear";
					String name5="Wolf";
					String name6="Lion";
					String name7="Tiger";
					String name8="Cat";
					String name9="Dog";
					String name10="Horse";
					Collection<String>animal=new ArrayList<String>();
					animal.add(name1);
					animal.add(name2);
					animal.add(name3);
					animal.add(name4);
					animal.add(name5);
					animal.add(name6);
					animal.add(name7);
					animal.add(name8);
					animal.add(name9);
					animal.add(name10);
					System.out.println("======foreach=====");
					for(String element : animal)
					{
						System.out.println(element);
					}
					System.out.println("====Iterator=====");
					Iterator <String> itr= animal.iterator();
					while(itr.hasNext())
					{
						String ele=itr.next();
						System.out.println(ele);
					}
					System.out.println("=================");
					System.out.println("size"+animal.size());
					

				}

			

		}
