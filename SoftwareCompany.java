package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany 
 {

				public static void main(String[] args) {
							// TODO Auto-generated method stub
							
							String name1="Wipro";
							String name2="TCS";
							String name3="Accenture";
							String name4="Infoysis";
							String name5="Cognizant";
							String name6="Tech-Mahindra";
							String name7="Microsoft";
							String name8="IBM";
							String name9="Oracle";
							String name10="Ntt";
							String name11="Apple";
							String name12="Facebook";
							String name13="Amazon";
							String name14="HCL";
							String name15="Cisco";
							String name16="Mphasis";
							String name17="L & T Infotech";
							String name18="Deloitte";
							String name19="Google";
							String name20="Capgemini";
							Collection<String>company=new ArrayList<String>();
							company.add(name1);
							company.add(name2);
							company.add(name3);
							company.add(name4);
							company.add(name5);
							company.add(name6);
							company.add(name7);
							company.add(name8);
							company.add(name9);
							company.add(name10);
							company.add(name11);
							company.add(name12);
							company.add(name13);
							company.add(name14);
							company.add(name15);
							company.add(name16);
							company.add(name17);
							company.add(name18);
							company.add(name19);
							company.add(name20);
							System.out.println("======foreach=====");
							for(String element : company)
							{
								System.out.println(element);
							}
							System.out.println("====Iterator=====");
							Iterator<String> itr= company.iterator();
							while(itr.hasNext())
							{
								String ele=itr.next();
								System.out.println(ele);
							}
							System.out.println("=================");
							System.out.println("size"+company.size());
							

						}
	}

