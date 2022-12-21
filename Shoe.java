package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Shoe 
{
	       public static void main(String[] args)
	       {
			// TODO Auto-generated method stub
			
							int name1=1;
							int name2=2;
							int name3=3;
						    int name4=4;
							int name5=5;
							int name6=6;
							int name7=7;
							int name8=8;
							int name9=9;
							int name10=10;
							int name11=11;
							int name12=12;
							int name13=13;
							int name14=14;
							int name15=15;
							Collection<Integer>shoesize=new ArrayList<Integer>();
							shoesize.add(name1);
							shoesize.add(name2);
							shoesize.add(name3);
							shoesize.add(name4);
							shoesize.add(name5);
							shoesize.add(name6);
							shoesize.add(name7);
							shoesize.add(name8);
							shoesize.add(name9);
							shoesize.add(name10);
							shoesize.add(name11);
							shoesize.add(name12);
							shoesize.add(name13);
							shoesize.add(name14);
							shoesize.add(name15);
							System.out.println("======foreach=====");
							for(Integer element : shoesize)
							{
								System.out.println(element);
							}
							System.out.println("====Iterator=====");
							Iterator <Integer> itr= shoesize.iterator();
							while(itr.hasNext())
							{
								Integer ele=itr.next();
								System.out.println(ele);
							}
							System.out.println("=================");
							System.out.println("size"+shoesize.size());
							
	                }
	}
