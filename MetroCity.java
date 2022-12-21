package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCity
{

			public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					String name1="bangalore";
					String name2="delhi";
					String name3="chennai";
					String name4="hyderbad";
					String name5="kolkata";
					
					Collection<String>metrocitynames=new ArrayList<String>();
					metrocitynames.add(name1);
					metrocitynames.add(name2);
					metrocitynames.add(name3);
					metrocitynames.add(name4);
					metrocitynames.add(name5);
					
					System.out.println("======foreach=====");
					for(String element : metrocitynames)
					{
						System.out.println(element);
					}
					System.out.println("====Iterator=====");
					Iterator <String> itr= metrocitynames.iterator();
					while(itr.hasNext())
					{
						String ele=itr.next();
						System.out.println(ele);
					}
					System.out.println("=================");
					System.out.println("size"+metrocitynames.size());
					

				}

			


		}

