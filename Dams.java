package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams
{

	public static void main(String[] args)
	{
	Collection<String> damInKar = new ArrayList<String>();
	damInKar.add("Bhadra");
	damInKar.add("Dharma");
	damInKar.add("Lakhya");
	damInKar.add("Kadra");
	damInKar.add("Alalur");
	damInKar.add("Matti");
	damInKar.add("Supa");
	damInKar.add("Hemavathi");
	damInKar.add("Tunga Bhadra");
	System.out.println("size of the dams in karanataka :" +damInKar.size());
	Collection<String> damInAdhar = new ArrayList<String>();
	damInAdhar.add("Kalyani");
	damInAdhar.add("Kandaleru");
	damInAdhar.add("Somasila");
	damInAdhar.add("Srisailam");
	damInAdhar.add("Veligallu");
	damInAdhar.add("NagarjunaSagar");
	System.out.println("size of the dams in Andhra :" +damInAdhar.size());
	Collection<String> damInOdisha = new ArrayList<String>();
	damInOdisha.add("Hirakud");
	damInOdisha.add("Indravati");
	damInOdisha.add("Kapur");
	damInOdisha.add("Mandira");
	damInOdisha.add("Upper Kolab");
	damInOdisha.add("Muran");
	damInOdisha.add("Podagada");
	System.out.println("size of the dams in Odish :" + damInOdisha.size());
	Collection<String> damInTamiNadu = new ArrayList<String>();
	damInTamiNadu.add("Aliyar");
	damInTamiNadu.add("Amaravathi");
	//Sholaiyar Dam
    damInTamiNadu.add("Bhavani");
	damInTamiNadu.add("Mettur");
	System.out.println("size of the dams in TamilNadu : " +damInTamiNadu.size());
	
	
	Collection<String> damInIndia = new ArrayList<String>();
	//damInIndia.addAll(damInIndia);
	damInIndia.addAll(damInKar);
	damInIndia.addAll(damInAdhar);
	damInIndia.addAll(damInOdisha);
	damInIndia.addAll(damInTamiNadu);
	System.out.println("size of the dams in India :" +damInIndia.size());
	
	System.out.println("=======================================");
	
	System.out.println("=====Dam name Start with T======");
	
	Iterator<String> itr1 = damInIndia.iterator();
	while(itr1.hasNext())
	{
		String element = itr1.next();
		if(element.startsWith("T"))
		{
			System.out.println("element statr with T : "+element);
		}
		
	}
   System.out.println("=======================================");
	
	System.out.println("=====Dam name Start with ra======");
	Iterator<String> itr=damInIndia.iterator();
	while(itr.hasNext())
	{
		String element=itr.next();
		if(element.endsWith("ra"))
		{
			System.out.println("Elements ends with ra are " + element);
			
		}
	}
	System.out.println("==================================");
	System.out.println("=====Lenght exceed==============");
	Iterator<String> itr3= damInIndia.iterator();
	while(itr3.hasNext())
	{
		String element=itr3.next();
		if(element.length()>=4)
		{
			System.out.println("length of dams " + element);
			
		}
	}
	System.out.println("==================================");
	System.out.println("=====  Remove  element ==============");
	
	Iterator<String> itr4=damInIndia.iterator();
	while(itr4.hasNext())
	{
		String element=itr4.next();
		if(element.contains("p"))
		{
			System.out.println("remove element " + element);
			itr4.remove();
			System.out.println(damInIndia);
			
		}
	}
	System.out.println("==================================");
	System.out.println("=====  Upper case ==============");
	
	for(String element : damInIndia)
	{
		
			System.out.println(element.toUpperCase());
		
	}
	System.out.println("==================================");
	System.out.println("=====  lower case ==============");
	
	for(String element : damInIndia)
	{
		
			System.out.println(element.toLowerCase());
		
	}
	System.out.println("================================");
	
	System.out.println("================polindrome of dam=====================");
	

	Iterator<String> itr5=damInIndia.iterator();
	while(itr5.hasNext())
	{
		String rev="";
		String element=itr5.next();

		for(int i=element.length()-1 ; i>=0;i--)
		{
			rev=rev+element.toLowerCase().charAt(i);
		}
		System.out.println(rev);
	
		if(element.equals(rev))
		{
			System.out.println("========================");
			System.out.println("element is polindrome "+element);
		}
			
	}
	}
}
